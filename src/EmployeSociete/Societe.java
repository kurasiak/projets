package EmployeSociete;

import java.util.ArrayList;

// Une société a un nom connu dès sa création et qui ne peut pas changer. 
// Une société tient à jour la liste des employés qu'elle a embauchés. 
// Une société peut augmenter le salaire de tous ses employés. 
// On peut obtenir la Masse Salariale d'une société. 

// La classe Societe contiendra les méthodes suivantes : 
public class Societe {

    private String nom;
    private double masseSalariale;
    ArrayList<Employe> employeListe = new ArrayList<Employe>();

    public Societe(String nom, int masseSalariale, ArrayList<Employe> employeListe) {
	super();
	this.nom = nom;
	this.masseSalariale = masseSalariale;
	this.employeListe = employeListe;
    }

// 1. public Societe(String nom) 
    public Societe(String nom) {
	this.nom = nom;
    }

// 3. public void embaucher(Employe e) 
    public void embaucher(Employe e) {
	employeListe.add(e);
	Employe.setSociete(this);// this c'est l'objet qui appél la methode
    }

// 4. public void AugmentationGenerale(double taux) 
    public void AugmentationGenerale(double taux) {

	for (Employe i : employeListe) {
	    i.augmentaterSalaire(taux);
	}
    }

// 2. public String getNom() 
    public String getNom() {
	return nom;
    }

// 5. public double getMasseSalariale() 
    public double getMasseSalariale() {
	double sum = 0;

	for (Employe i : employeListe) {
	    sum += i.getSalaire();
	}
	this.masseSalariale = sum;

	return sum;
    }

// 6. public String toString() 
    @Override
    public String toString() {
	return "Societe [nom=" + nom + ", employeListe=" + employeListe + "]";
    }

}
