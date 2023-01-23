package Heritage;

public class habitationIndividuelle extends habitation {
//    attribus
    private int nbPiece;
    private boolean piscine = false;

//    constructeur
    public habitationIndividuelle(String proprietaire, String adresse, double surface, int nbPiece) {
	super(proprietaire, adresse, surface);
	this.nbPiece = nbPiece;
    }

//    methode
    public double impotIndividuelle() {
	double sumPiscine = 500, sumPiece = 100;

	if (piscine == false) {
	    return impotHabitation() + sumPiece * nbPiece;

	} else {
	    return impotHabitation() + sumPiece * nbPiece + sumPiscine;
	}
    }

    public void afficheIndividuelle() {
	afficheHabitation();

	System.out.println(toString());
    }

//    acceseur & mutateur
    public int getNbPiece() {
	return nbPiece;
    }

    public void setNbPiece(int nbPiece) {
	this.nbPiece = nbPiece;
    }

    public boolean isPiscine() {
	return piscine;
    }

    public void setPiscine(boolean piscine) {
	this.piscine = piscine;
    }

    @Override
    public String toString() {
	return "habitationIndividuelle [nbPiece=" + nbPiece + ", piscine=" + piscine + "]";
    }

}
