package ExercicesOrienteObjet;

import java.util.ArrayList;

//    Exercice 6: Un élève sera ici modélisé par la classe Eleve, de la façon suivante.
public class Eleve {

//    La classe Eleve possède trois attributs :
//     - Son nom, nommé nom, de type String,
    private String nom;
//     - Un ensemble de notes, nommé listeNotes, qui sont des entiers rangés dans un tableau int[10]
    private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
//     - Une moyenne de type double, nommée moyenne, ... *1 
    private double moyenne;

//    La classe Eleve possède un constructeur permettant uniquement d'initialiser le nom de l'élève.
    public Eleve(String nom) {
	super();
	this.nom = nom;
    }

    // La classe Eleve possède aussi cinq méthodes publiques :
//     - Un getter pour le nom de l'élève c'est-à-dire une méthode d'en-tête public String getNom() renvoie le nom de l'élève ;
    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

//     - Un getter pour la liste des notes de l'élève c'est-à-dire une méthode d'en-tête public int[] getListeNotes() renvoie la liste des notes de l'élève ;
    public ArrayList<Integer> getListeNotes() {
	return listeNotes;
    }

    public void setListeNotes(ArrayList<Integer> listeNotes) {
	this.listeNotes = listeNotes;
    }

//     - Un getter pour la moyenne de l'élève c'est-à-dire une méthode d'en-tête public double getMoyenne() renvoie la valeur de l'attribut moyenne ;
    public double getMoyenne() {
	return moyenne;
    }

    public void setMoyenne(double moyenne) {
	this.moyenne = moyenne;
    }

//        *1 ... qui doit toujours être égale à la moyenne des notes contenues dans l'attribut listeNotes.
    public double moyenneListeNotes(int note) {
	int sum = 0;

	for (Integer n : listeNotes) {
	    sum += n;
	}

	moyenne = sum / listeNotes.size();

	return moyenne;
    }

//     - La méthode d'en-tête public void ajouterNote(int note) ajoute la note reçue en paramètre à listeNotes ; 
//        si la note reçue en paramètre est négative, la note introduite est 0 ; 
//        si la note reçue en paramètre est supérieure à 20, la note introduite est 20 ; 
    public void ajouterNote(int note) {
	if (note < 0) {
	    note = 0;
	} else if (note > 20) {
	    note = 20;
	} else {
	    listeNotes.add(note);
	}
    }

//     - La méthode d'en-tête public String toString() qui retourne une description de l'élève considéré (par exemple : "Sophie (12.25)") 
    @Override
    public String toString() {
	return "Eleve [nom=" + nom + ", moyenne=" + moyenne + "]";
    }
}
