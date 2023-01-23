package entrepriseVoiture;

import java.util.ArrayList;

public class Entreprise {

//  attribue
    private ArrayList<Roue> listeEntrepriseRoue = new ArrayList<Roue>();
    private ArrayList<Voiture> listeEntrepriseVoiture = new ArrayList<Voiture>();

//  constructeur
    public Entreprise(ArrayList<Roue> listeEntrepriseRoue, ArrayList<Voiture> listeEntrepriseVoiture) {
	super();
	this.listeEntrepriseRoue = listeEntrepriseRoue;
	this.listeEntrepriseVoiture = listeEntrepriseVoiture;
    }

//  methode

//  accesseur
    public ArrayList<Roue> getListeEntrepriseRoue() {
	return listeEntrepriseRoue;
    }

//  mutateur
    public void setListeEntrepriseRoue(ArrayList<Roue> listeEntrepriseRoue) {
	this.listeEntrepriseRoue = listeEntrepriseRoue;
    }

    public ArrayList<Voiture> getListeEntrepriseVoiture() {
	return listeEntrepriseVoiture;
    }

    public void setListeEntrepriseVoiture(ArrayList<Voiture> listeEntrepriseVoiture) {
	this.listeEntrepriseVoiture = listeEntrepriseVoiture;
    }

    @Override
    public String toString() {
	return "Entreprise [listeEntrepriseRoue=" + listeEntrepriseRoue + ", listeEntrepriseVoiture="
		+ listeEntrepriseVoiture + "]";
    }

}
