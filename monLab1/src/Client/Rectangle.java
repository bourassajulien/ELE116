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
Nom du fichier : Ovale.java
Date créé : 2015-10-03
Date dern. modif. 2015-10-03
***************************************************
Historique des modifications
***************************************************
2015-10-03 Version initiale (et1)
2010-10-03 Ajout de la fonction dessine (et1)
**************************************************/
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;


public class Rectangle extends Forme {

	private int x1, y1, x2, y2;
	private String colorSelect;
	
	public Rectangle(int x1, int y1, int x2, int y2, String colorSelect) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.colorSelect = colorSelect;
	}
	
	public Color getColor(){
		if (colorSelect.equals("RED")) {
			Color color = Color.RED;
			return color;
		} else if (colorSelect.equals("BLUE")) {
			Color color = Color.BLUE;
			return color;
		} else
			return null;


	}
	
	/**
	 * Cette méthode retourne un objet qui peut être affiché dans une fenêtre.
	 */
	public Shape dessine()
	{
		return new Rectangle2D.Double( ( double ) x1, ( double ) y1, ( double ) x2-x1, ( double ) y2-y1 );
	}

}
