package Hotel;



//commentaire
public class chambre {
// ############################################### attribus ##############################################
    private int nbPersonne;
    private static int numPorte;
    private boolean libresReserver;

// ############################################ constructeur #############################################
    public chambre(int nbPersonne, int numPorte, boolean libresReserver) {
	super();
	this.nbPersonne = nbPersonne;
	chambre.numPorte = numPorte;
	this.libresReserver = libresReserver;
    }

// ############################################### methode ###############################################

// ######################################### acceseur & mutateur #########################################
    public int getNbPersonne() {
	return nbPersonne;
    }

    public void setNbPersonne(int nbPersonne) {
	this.nbPersonne = nbPersonne;
    }

    public static int getNumPorte() {
	return numPorte;
    }

    public void setNumPorte(int numPorte) {
	chambre.numPorte = numPorte;
    }

    public boolean getLibresReserver() {
	return libresReserver;
    }

    public void setLibresReserver(boolean libresReserver) {
	this.libresReserver = libresReserver;
    }

// ############################################## toString ###############################################
    @Override
    public String toString() {
	return "chambre [nbPersonne=" + nbPersonne + ", numPorte=" + numPorte + "]";
    }

}
