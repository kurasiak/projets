package Heritage;

public class habitationProfessionnelle extends habitation {
//    attribus
    private int nbEmploye;

//    constructeur
    public habitationProfessionnelle(String proprietaire, String adresse, double surface, int nbEmploye) {
	super(proprietaire, adresse, surface);
	this.nbEmploye = nbEmploye;
    }

//    methode
    public double impotProfessionnelle() {
	int trancheEmployes = 10;
	double sumEmployes = 1000;

	return impotHabitation() + (nbEmploye / trancheEmployes) * sumEmployes;
    }

    public void afficheProfessionnelle() {
	afficheHabitation();

	System.out.println(toString());
    }

//    acceseur & mutateur
    public int getNbEmploye() {
	return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
	this.nbEmploye = nbEmploye;
    }

    @Override
    public String toString() {
	return "habitationProfessionnelle [nbEmploye=" + nbEmploye + "]";
    }

}
