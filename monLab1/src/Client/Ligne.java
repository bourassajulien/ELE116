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
Nom du fichier : Ligne.java
Date créé : 2015-10-03
Date dern. modif. 2015-10-03
***************************************************
Historique des modifications
***************************************************
2015-10-03 Version initiale (et1)
2010-10-03 Ajout de la fonction dessiner (et1)
**************************************************/
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.Color;


public class Ligne extends Forme {

	private int x1, y1, x2, y2;
	
	public Ligne(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2 ;
		this.y2 = y2;

	}
	
	public Color getColor(){
	       Color color = Color.BLACK;
	       return color;
	}
	
	public Shape dessine(){
		return new Line2D.Double( ( double ) x1, ( double ) y1, ( double ) x2, ( double ) y2 );
	}

}
