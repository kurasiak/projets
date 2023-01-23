package ExercicesOrienteObjet;

public class Livre {

    private String id, titre, auteur; // Nom complet pour l'auteur
    private int prix;

    public Livre(String id, String titre, String auteur, int prix) {
	this.id = id;
	this.titre = titre;
	this.auteur = auteur;
	this.prix = prix;
    }

    public String getId() {
	return id;
    }

    public String getTitre() {
	return titre;
    }

    public String getAuteur() {
	return auteur;
    }

    public int getPrix() {
	return prix;
    }

    public String toString() {
	return id + titre + auteur + prix;
    }

}
