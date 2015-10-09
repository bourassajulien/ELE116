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
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Ovale extends Forme {

	private int x1;
	private int x2;
	private int radx;
	private int rady;
	private String colorSelect;

	public Ovale(int x1, int x2, int radx, String colorSelect) {
		// rayon en X et en Y identique
		this.x1 = x1;
		this.x2 = x2;
		this.radx = radx;
		this.rady = radx;
		this.colorSelect = colorSelect;
	}

	public Ovale(int x1, int x2, int radx, int rady, String colorSelect) {
		this.x1 = x1;
		this.x2 = x2;
		this.radx = radx;
		this.rady = rady;
		this.colorSelect = colorSelect;
	}

	public Color getColor() {
		if (colorSelect.equals("GREEN")) {
			Color color = Color.GREEN;
			return color;
		} else if (colorSelect.equals("YELLOW")) {
			Color color = Color.YELLOW;
			return color;
		} else
			return null;
	}

	public Shape dessine() {
		return new Ellipse2D.Double((double) x1 + radx, (double) x2 - rady, (double) radx, (double) rady);
	}

}
