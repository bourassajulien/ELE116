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
2010-10-06 Ajout de la fonction generate (et1)
**************************************************/
public class GenerateForme {
	
	// Creation des formes
	public static Forme generate(String forme, int arg1, int arg2, int arg3, int arg4,String color){
	
		if( forme.equals( "<RECTANGLE>" ) )
		{
			return new Rectangle( arg1, arg2, arg3, arg4, "RED" );
		}
		else if( forme.equals( "<CARRE>" ) )
		{
			return new Rectangle( arg1, arg2, arg3, arg4,  "BLUE"  );
		}
		else if( forme.equals( "<OVALE>" ) )
		{
			return new Ovale( arg1, arg2, arg3, arg4,  "GREEN"  );
		}
		else if( forme.equals( "<CERCLE>" ) )
		{
			return new Ovale( arg1, arg2, arg3, arg3, "YELLOW"  );
		}
		else if( forme.equals( "<LIGNE>" ) )
		{
			return new Ligne( arg1, arg2, arg3, arg4);
		}
		else return null;
	}
}
