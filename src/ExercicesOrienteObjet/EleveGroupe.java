package ExercicesOrienteObjet;

import java.util.ArrayList;
import java.util.Formatter;

public class EleveGroupe {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

//	     - Créer un groupe d'élèves (tableau d'élèves de taille 15)
	ArrayList<Eleve> groupeEleve = new ArrayList<Eleve>();

	Eleve eleve1 = new Eleve("paul");

//	     - Faire en sorte qu'on puisse ajouter, ...
	ajouterEleve(eleve1, groupeEleve);

//	        ... modifier, 
	modifierEleve(0, null, groupeEleve);

//	        ... supprimer et 
	supprimerEleve(0, groupeEleve);

//	        ... rechercher un élève
	rechercheEleve(0, groupeEleve);

//	     - Créer une méthode qui retourne la moyenne du groupe
	maxMinGroupe(0);

//	     - Afficher la note maximale et minimale dans le groupe 
	moyenneGroupe(0, groupeEleve);
    }

//    - Faire en sorte qu'on puisse ajouter, ...
    public static void ajouterEleve(Eleve e, ArrayList<Eleve> aL) {
	aL.add(e);
    }

//    ... modifier, 
    public static void modifierEleve(int index, Eleve e, ArrayList<Eleve> aL) {
	aL.set(index, e);
    }

//    ... supprimer et 
    public static void supprimerEleve(int index, ArrayList<Eleve> aL) {
	aL.remove(index);
    }

//    ... rechercher un élève
    public static void rechercheEleve(int index, ArrayList<Eleve> aL) {
	aL.get(index);
    }

//    - Créer une méthode qui retourne la moyenne du groupe
    public static void moyenneGroupe(Eleve note, ArrayList<Eleve> aL) {
	int sum = 0, moyenne = 0;

	for (Eleve n : aL) {
	    sum += n;
	}

	moyenne = sum / aL.size();

	System.out.println(moyenne);
    }

//    - Afficher la note maximale et minimale dans le groupe 
    public static void maxMinGroupe(int note) {
	int min = 0, max = 0;

	if (note < min) {
	    note = min;
	} else if (note > max) {
	    note = max;
	}

	Formatter formatter = new Formatter();
	formatter.format("min: %f max: %f", min, max);
	System.out.println(formatter);
    }
}
