package entrepriseVoiture;

public class Roue {

//    attribue
    private int num;
    private float diametre;
    private boolean etat = true;

//    constructeur
    public Roue(int num, float diametre) {
	super();
	this.num = num;
	this.diametre = diametre;
    }

//    methode

//    accesseur
    public int getNum() {
	return num;
    }

//    mutateur
    public void setNum(int id) {
	this.num = id;
    }

    public float getDiametre() {
	return diametre;
    }

    public void setDiametre(float diametre) {
	this.diametre = diametre;
    }

    public boolean isEtat() {
	return etat;
    }

    public void setEtat(boolean etat) {
	this.etat = etat;
    }

    @Override
    public String toString() {
	return "Roue [id=" + num + ", diametre=" + diametre + ", etat=" + etat + "]";
    }

}
