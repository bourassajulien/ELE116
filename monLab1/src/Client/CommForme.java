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
Nom du fichier : CommForme.java
Date créé : 2015-10-03
Date dern. modif. 2015-10-03
***************************************************
Historique des modifications
***************************************************
2015-10-03 Version initiale (et1)
2010-10-03 Ajout de la fonction envoieGET (et1)
2010-10-03 Ajout de la fonction envoieEND (et1)
**************************************************/

public class CommForme {
	Comm comm = new Comm();	
	
	public void envoieGET(){
		
		comm.envoieChaine("GET");
	}
	
	public void envoieEND(){
		comm.envoieChaine("END");
	}
	
}
