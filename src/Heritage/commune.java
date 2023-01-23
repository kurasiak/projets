package Heritage;

import java.util.ArrayList;

public class commune {
//    attribus
    private String nom;
    private ArrayList<habitation> listeHabitation = new ArrayList<habitation>();

//    constructeur
    public commune(String nom, ArrayList<habitation> listeHabitation) {
	super();
	this.nom = nom;
	this.listeHabitation = listeHabitation;
    }

//    methode
    public double impôtLocal() {
	double sum = 0;

	for (habitation h : listeHabitation) {
	    sum = sum + h.impotHabitation();
	    return sum;
	}
//
//	for (habitation h : listeHabitation) {
//	    if (h instanceof habitationProfessionnelle) {
//	    }

    }

//    acceseur & mutateur
    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public ArrayList<habitation> getListeHabitation() {
	return listeHabitation;
    }

    public void setListeHabitation(ArrayList<habitation> listeHabitation) {
	this.listeHabitation = listeHabitation;
    }

    @Override
    public String toString() {
	return "commune [nom=" + nom + ", listeHabitation=" + listeHabitation + "]";
    }
}
