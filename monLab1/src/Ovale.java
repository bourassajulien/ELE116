import java.awt.Graphics2D;


public class Ovale extends Forme {

	private int x, y;
	private int Largeur, Hauteur;
	
	public Ovale(int[] coords) {
		x = coords[0];
		y = coords[1];
		Largeur = coords[2];
		Hauteur = coords[3];
	}
	
	public void draw(Graphics2D g2) {
		g2.drawOval(x, y, Largeur, Hauteur);
	}

}
