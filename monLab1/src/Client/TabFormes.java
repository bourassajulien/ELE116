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
Nom du fichier : TabFormes.java
Date créé : 2015-10-03
Date dern. modif. 2015-10-03
***************************************************
Historique des modifications
***************************************************
2015-10-03 Version initiale (et1)
2010-10-03 Ajout de la fonction TabFormes() (et1)
2010-10-03 Ajout de la fonction add (et1)
2010-10-03 Ajout de la fonction add (et1)
2010-10-03 Ajout de la fonction remove (et1)
2010-10-03 Ajout de la fonction getSize (et1)
2010-10-03 Ajout de la fonction getForme (et1)
2010-10-03 Ajout de la fonction dessine (et1)
**************************************************/
import java.awt.Graphics2D;
import java.util.*;
import java.awt.Color;

public class TabFormes {

	public static int tabLength = 10;
	public String forme;
	public String id;
	
	// Constructeur
	// Tableau des formes
	ArrayList<Object> formeArray = new ArrayList<Object>();

	
	public void add(String str){
		
	}
	
	public void add(Forme f){
		formeArray.add(f);
	}

	public void remove(int index){
		formeArray.remove(index);
		
	}	
	
	public int getSize(){
		
		 int arraySize = formeArray.size();
		 
		return arraySize;
	}
	
	public Forme getForme(int index){
		return (Forme) formeArray.get(index);
	}
	
	public Color getColor(int index){
		   Forme f = getForme(index);
	       Color color = f.getColor();
	       return color;
	}
	
	public void dessine(Graphics2D g2){
		
	}
	
	public static void main(String[] args) {
		
		TabFormes tabFormes = new TabFormes();
	/*	
		tabFormes.add(GenerateForme.generate("<RECTANGLE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<RECTANGLE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<RECTANGLE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<RECTANGLE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<RECTANGLE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<RECTANGLE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10));
		System.out.println("Size: " + tabFormes.getSize());

		
		for(int i=0;i<tabFormes.getSize();i++){
			System.out.println("Size: " + tabFormes.getForme(i));
		}
		
		tabFormes.remove(1);
		System.out.println("Size: " + tabFormes.getSize());
		
		for(int i=0;i<tabFormes.getSize();i++){
			System.out.println("Size: " + tabFormes.getForme(i));
		}
		*/
		
		tabFormes.add(GenerateForme.generate("<RECTANGLE>", 10, 10, 10, 10, ""));
		System.out.println("Size: " + tabFormes.getSize());
		for(int i=0;i<tabFormes.getSize();i++){
			System.out.println("Size: " + tabFormes.getForme(i));
		}
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10, ""));
		System.out.println("Size: " + tabFormes.getSize());
		for(int i=0;i<tabFormes.getSize();i++){
			System.out.println("Size: " + tabFormes.getForme(i));
		}
		tabFormes.add(GenerateForme.generate("<OVALE>", 10, 10, 10, 10, ""));
		System.out.println("Size: " + tabFormes.getSize());
		for(int i=0;i<tabFormes.getSize();i++){
			System.out.println("Size: " + tabFormes.getForme(i));
		}
		
	}

}
