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
Nom du fichier : Parser.java
Date créé : 2015-10-03
Date dern. modif. 2015-10-03
***************************************************
Historique des modifications
***************************************************
2015-10-03 Version initiale (et1)
2010-10-03 Ajout de la fonction parseString (et1)
2010-10-06 Ajout d'un main pour tester (et1)
**************************************************/
import java.util.StringTokenizer;

public class Parser
{
	int nseq = 0;
	String forme = "";
	int arg1 = 0;
	int arg2 = 0;
	int arg3 = 0;
	int arg4 = 0;
	
	// parse la string reucue et crée la bonne forme
	public void parseString(String message) 
	{
		StringTokenizer tokenizer = new StringTokenizer(message);

		this.nseq = Integer.parseInt( tokenizer.nextToken( " " ) );
		this.forme = tokenizer.nextToken( " " );
		this.arg1 = Integer.parseInt( tokenizer.nextToken() );
		this.arg2 = Integer.parseInt( tokenizer.nextToken() );
		this.arg3 = Integer.parseInt( tokenizer.nextToken() );
		
		if(!this.forme.equals("<CERCLE>") ){
			this.arg4 = Integer.parseInt( tokenizer.nextToken() );	
		}

	
	}
	public static void main(String[] args){
	
		Parser parser = new Parser();
		String buffer = "";
			
		Comm comm = new Comm();
		comm.connectionServeur("localhost", 10000);
		comm.envoieChaine("GET");
		
		buffer = comm.recoieChaine();
	   
		System.out.println(buffer);
	    comm.envoieChaine("END");
	    comm.terminerConnection();

	    parser.parseString(buffer);
	    
	    
	}	
}
