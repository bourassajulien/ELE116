package Client;

/**************************************************
Cours : ELE116
Session : A2015
Groupe : 01
Projet : Laboratoire #1
Étudiant1 : Julien Gagnon-Bourassa
etudiant2 : Kevin Dufresne 
Code(s) perm. : GAGJ23108608
Code(s) perm. : DUFK17018901

Professeur : Kim Khoa Nguyen
Nom du fichier : Comm.java
Date créé : 2015-10-03
Date dern. modif. 2015-10-03
***************************************************
Historique des modifications
***************************************************
2015-10-03 Version initiale (et1)
2010-10-03 Ajout de la fonction connectionServeur (et1)
2010-10-03 Ajout de la fonction envoieChaine (et1)
2010-10-03 Ajout de la fonction recoieChaine (et1)
2010-10-03 Ajout de la fonction TerminerConnection (et1)
2010-10-06 Ajout d'un main pour valider les fonctions (et1)
**************************************************/
import java.io.*;
import java.net.*;



public class Comm {
    Socket client = null;  
    DataOutputStream os = null;
    DataInputStream is = null;
   
    boolean closing ;

    
    public boolean connectionServeur(String host,int port){
     
        try {
            this.closing = true;
            client = new Socket(host, port);
            os = new DataOutputStream(client.getOutputStream());
            is = new DataInputStream(client.getInputStream());
        }
        
        catch (UnknownHostException e) {
            System.err.println("Don't know about host: hostname");  
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");

        }
     
        if (client != null && os != null && is != null) {
        	return true;
        }else{
        	return false;
        }
    }

    public void envoieChaine(String chaine){
    	try{
    		PrintStream output = new PrintStream(client.getOutputStream()); 
    		output.println(chaine);
    	}
    	catch(IOException e){
    		System.out.println(e);
    	}
    }
    
    
    public String recoieChaine(){
    	 String data = "";   	
    	try{
			BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// Boucle pour ne pas avoir le prompt de commande
			do{
				// On enregistre la valeur.
				data = input.readLine();
			}while(data.equals("commande> "));

		}
		
		catch (IOException e){
			System.out.println(e);
		}
   
	    return data;
   
    }
    
	public void terminerConnection(){

		try{
            is.close();
            os.close();
            client.close(); 

			}
            catch (UnknownHostException e) {
            	System.err.println("Trying to connect to unknown host: " + e);
            } catch (IOException e) {
            	System.err.println("IOException:  " + e);
        }  
    
    }       
	public static void main(String[] args){
	
		String buffer = "";
			
		Comm comm = new Comm();
		comm.connectionServeur("localhost", 10000);
		comm.envoieChaine("GET");
		
		buffer = comm.recoieChaine();
	    
		System.out.println(buffer);
	    comm.envoieChaine("END");
	    comm.terminerConnection();

	}
		
}

