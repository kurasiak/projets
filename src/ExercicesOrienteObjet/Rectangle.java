package ExercicesOrienteObjet;

public class Rectangle {

    private double longueur = 5;
    private double largeur = 8;

    public Rectangle(double longueur, double largeur) {
	super();
	this.longueur = longueur;
	this.largeur = largeur;
    }

    public double getLongueur() {
	return longueur;
    }

    public double getLargeur() {
	return largeur;
    }

    public double perimetre(double longueur, double largeur) {
	double sum = 0;
	sum = longueur * 2 + largeur * 2;
	return sum;
    }

    public double aire(double longueur, double largeur) {
	double sum = 0;
	sum = longueur * largeur;
	return sum;
    }

    public String isCarre() {
	String n = null;
	if (longueur == largeur) {
	    n = "c'est un carré. ";
	} else {
	    n = "c'est un rectangle. ";
	}
	return n;
    }

    public String toString() {
	return "Longueur: " + this.longueur + " - Largeur: " + this.largeur + " - Perimetre: "
		+ perimetre(longueur, largeur) + " - Aire: " + aire(longueur, largeur) + " - " + isCarre();
    }

    public static void main(String[] args) {
	Rectangle rectangle = new Rectangle(5, 8d);
	System.out.println(rectangle);
    }
}
