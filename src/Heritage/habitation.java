package Heritage;

// super class
public class habitation {
//    attribus
    private String proprietaire;
    private String adresse;
    private double surface;

//    super constructeur
    public habitation(String proprietaire, String adresse, double surface) {
	super();
	this.proprietaire = proprietaire;
	this.adresse = adresse;
	this.surface = surface;
    }

//    methode
    public double impotHabitation() {
	double impot = 2;

	return surface * impot;
    }

    public void afficheHabitation() {
	System.out.println(toString());
    }

//    acceseur & mutateur
    public String getProprietaire() {
	return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
	this.proprietaire = proprietaire;
    }

    public String getAdresse() {
	return adresse;
    }

    public void setAdresse(String adresse) {
	this.adresse = adresse;
    }

    public double getSurface() {
	return surface;
    }

    public void setSurface(double surface) {
	this.surface = surface;
    }

    @Override
    public String toString() {
	return "habitation [proprietaire=" + proprietaire + ", adresse=" + adresse + ", surface=" + surface + "]";
    }

}
