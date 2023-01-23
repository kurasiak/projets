package ExercicesOrienteObjet;

public class Voiture {

    private String id;
    private String marque;
    private double vitesse;
    private double puissance;

    public Voiture(String id, String marque, double vitesse, double puissance) {
	super();
	this.id = id;
	this.marque = marque;
	this.vitesse = vitesse;
	this.puissance = puissance;
    }

    public String getId() {
	return id;
    }

    public String getMarque() {
	return marque;
    }

    public double getVitesse() {
	return vitesse;
    }

    public double getPuissance() {
	return puissance;
    }

    public String toString() {
	return id + marque + vitesse + puissance;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Voiture voiture = new Voiture("AAA ", "mini ", 12.5, 5.5);

	System.out.println(voiture);
    }

}
