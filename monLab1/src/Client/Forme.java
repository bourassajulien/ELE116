package Client;


/**************************************************
Cours : ELE116
Session : A2015
Groupe : 01
Projet : Laboratoire #1
Étudiant1 : Julien Gagnon-Bourassa
etudiant2 : Kevin Dufresne 
Code(s) perm. : GAGJ23108608
Code(s) perm. : AAAA1234

Professeur : Kim Khoa Nguyen
Nom du fichier : Forme.java
Date créé : 2015-10-03
Date dern. modif. 2015-10-03
***************************************************
Historique des modifications
***************************************************
2015-10-03 Version initiale (et1)
2010-10-03 Ajout de la fonction Forme (et1)
**************************************************/
import java.awt.Shape;
import java.awt.Color;


public abstract class Forme {
	

	public Forme() {
		
	}
	
	/**
	 * Méthode qui permet donner la couleur
	 * @return 
	 * @return Couleur
	 */
	abstract public Color getColor();
	
	/**
	 * Méthode qui permet de dessiner la forme
	 * @return Shape
	 */
	abstract public Shape dessine();
}
