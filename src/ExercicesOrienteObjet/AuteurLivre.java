package ExercicesOrienteObjet;

// Il s’agit dans cet exercice de définir la classe correspondant aux livres.
// Tout livre sera décrit en utilisant les informations suivantes : sa référence, son titre, son auteur, son éditeur, le nombre d’exemplaires présents dans la bibliothèque et son genre. 
// On utilisera ici comme restriction qu’un livre ne peut être écrit que par un unique auteur. 

//    Écrivez la classe Livre en respectant les exigences suivantes :
public class AuteurLivre {

// 1. respecter les exigences décrites dans l’exercice 1 excepté le point 4 ;
// - a1. tous les attributs doivent être privés ;
    private int reference;
    private String titre;
    private String auteur;
    private String editeur;
    private int nbExemplaire;
    private String genre;

// 7. on veut avoir un constructeur permettant d’initialiser tous les attributs
// - a2. un constructeur public initialisant tous les attributs (les paramètres doivent avoir exactement les mêmes noms que les attributs) ;
    public AuteurLivre(int reference, String titre, String auteur, String editeur, int nbExemplaire, String genre) {
	super();
	this.reference = reference;
	this.titre = titre;
	this.auteur = auteur;
	this.editeur = editeur;
	this.nbExemplaire = nbExemplaire;
	this.genre = genre;
    }

//- a3. la présence d’un accesseur public (getter) pour chaque attribut ;
    public int getReference() {
	return reference;
    }

    public String getTitre() {
	return titre;
    }

    public String getAuteur() {
	return auteur;
    }

    public String getEditeur() {
	return editeur;
    }

    public int getNbExemplaire() {
	return nbExemplaire;
    }

    public String getGenre() {
	return genre;
    }

// - a5. la présence d’une méthode publique toString pour afficher les informations d’un auteur;
    @Override
    public String toString() {
	return "AuteurLivre [reference=" + reference + ", titre=" + titre + ", auteur=" + auteur + ", editeur="
		+ editeur + ", nbExemplaire=" + nbExemplaire + ", genre=" + genre + "]";
    }

// - a6. la présence d’une méthode publique equals : ...
    public boolean equals(AuteurLivre a) {

// ... deux auteurs sont égaux s’ils possèdent la même référence.
	if (this.reference == a.reference) {
	    return false;
	} else {
	    return false;
	}
    }

// 2. ajouter un setter pour uniquement l’éditeur ;
    public void setEditeur(String editeur) {
	this.editeur = editeur;
    }

// 3. ajouter une méthode nouvelExemplaire() qui permet d’ajouter un seul exemplaire
    public void nouvelExemplaire() {
	nbExemplaire++;
    }

// 4. ajouter une méthode nouvelExemplaire(nb) qui permet d’ajouter plusieurs exemplaires à la fois
    public void nouvelExemplaire(int nb) {
	nbExemplaire += nb;
    }

// 5. ajouter une méthode perteExemplaire() qui permet de réduire le nombre d’exemplaires que de 1 à la fois. ...
    public void perteExemplaire() {

// ... Attention : le nombre d’exemplaire ne peut pas être négatif ! ;
	if (nbExemplaire > 0) {
	    nbExemplaire--;

	} else if (nbExemplaire <= 0) {
	    nbExemplaire = 0;
	}
    }

// 6. on veut une méthode permettant de savoir si un livre est présent dans la bibliothèque ...
    public void livrePresent() {

// ... (le nombre d’exemplaires est supérieur à 0) ;
	if (nbExemplaire > 0) {
	    System.out.println(toString());
	}
    }

}
