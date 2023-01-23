package ExercicesOrienteObjet;

import java.util.ArrayList;

// L’objectif de cet exercice est de définir la classe qui correspond aux bibliothèques.
public class AuteurBiblioteque {

// Une bibliothèque est décrite par son nom et la liste des livres qu’elle contient.
// Vous devez respecter les exigences suivantes :
// 1. respecter le principe d’encapsulation de la même manière ;
    private String nom;
    private ArrayList<AuteurLivre> listeLivre = new ArrayList<AuteurLivre>();

// 2. une bibliothèque contient au maximum 100 livres (ce nombre doit être déclaré comme une constante) ;

// 3. il n’y a qu’un constructeur dont la tâche est de donner un nom à la bibliothèque ainsi que la création du tableau de livres sans remplissage en utilisant la constante représentant le nombre maximum de livres ;
    public AuteurBiblioteque(String nom, ArrayList<AuteurLivre> listeLivre) {
	super();
	this.nom = nom;
	this.listeLivre = listeLivre;
    }

// 4. une méthode permettant l’ajout de livres (un livre à la fois), il est important de noter que l’on ne peut pas avoir deux livre distinct avec une même référence ;
    public void ajouterLivre(AuteurLivre aL) {
	listeLivre.add(aL);
    }

// 5. une méthode AfficheCatalogue permettant d’afficher toutes les informations relatives aux livres présents dans la bibliothèque ;
    public void afficheCatalogue(AuteurLivre aL) {

	for (AuteurLivre i : listeLivre) {
	    System.out.println(i.toString());
	}
    }

// 6. des méthodes getTitre(String ref), getAuteur(String ref), getEditeur(String ref), getGenre(String ref) et getNbExemplaires(String ref) qui retournent les caractéristiques d’un livre grâce à sa référence ;
    public void afficherAuteur(int reference) {

	for (AuteurLivre i : listeLivre) {
	    if (i.getReference() == reference) {
		System.out.println(i.getTitre());
	    }
	}
    }

// 7. une méthode afficheLivre(String ref) qui affiche toutes les caractéristiques d’un livre grâce à sa référence ;
    public void afficherLivre(int reference) {

	for (AuteurLivre i : listeLivre) {
	    if (i.getReference() == reference) {
		System.out.println(i.toString());
	    }
	}
    }
}
