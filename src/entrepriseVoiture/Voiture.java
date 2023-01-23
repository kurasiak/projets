package entrepriseVoiture;

import java.util.ArrayList;

public class Voiture {

//    attribue
    private int num;
    private String marque;
    private String couleur;
    private ArrayList<Roue> listeRoue = new ArrayList<Roue>();

//    constructeur
    public Voiture(int num, String marque, String couleur) {
	super();
	this.num = num;
	this.marque = marque;
	this.couleur = couleur;
    }

//    methode
    public void ajoutRoue(Roue e) {
	if (e.isEtat() == true) {
	    listeRoue.add(e);
	    e.setEtat(false);
	}

    }

//    acesseur
    public int getNum() {
	return num;
    }

//    mutateur
    public void setNum(int num) {
	this.num = num;
    }

    public String getMarque() {
	return marque;
    }

    public void setMarque(String marque) {
	this.marque = marque;
    }

    public String getCouleur() {
	return couleur;
    }

    public void setCouleur(String couleur) {
	this.couleur = couleur;
    }

    public ArrayList<Roue> getListeVoiture() {
	return listeRoue;
    }

    public void setListeVoiture(ArrayList<Roue> listeVoiture) {
	this.listeRoue = listeVoiture;
    }

    @Override
    public String toString() {
	return "Voiture [num=" + num + ", marque=" + marque + ", couleur=" + couleur + ", listeVoiture=" + listeRoue
		+ "]";
    }

}
