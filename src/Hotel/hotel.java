package Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class hotel {
    static Scanner sc = new Scanner(System.in);

// ############################################### attribus #############################################
    private String nomHotel;
    private int nbChambreSimple;
    private int nbChambreJumeaux;
    private int nbChambreDouble;
    private int nbChambreSuite;
    private int nbChambreHotel;
    private static ArrayList<chambre> listChambre = new ArrayList<chambre>();

// ############################################ constructeur #############################################
    public hotel(String nomHotel, int nbChambreSimple, int nbChambreJumeaux, int nbChambreDouble, int nbChambreSuite) {
	super();
	this.nomHotel = nomHotel;
	this.nbChambreSimple = nbChambreSimple;
	this.nbChambreJumeaux = nbChambreJumeaux;
	this.nbChambreDouble = nbChambreDouble;
	this.nbChambreSuite = nbChambreSuite;
    }

// ############################################### methode ###############################################   
    public void afficher1ereChambreVide() {
	int nb = 0;

	for (chambre c : listChambre) {
	    if (c.getLibresReserver() == false) {
		nb = chambre.getNumPorte();

		System.out.println(nb);
	    }

	}
    }

    public void creationChambre() {
	for (int i = 0; i < nombreChambreHotel(); i++) {
	    listChambre.add(new chambre(0, i, false));
	}
    }

    public int nombreChambreHotel() { // #### CALCUL SOMME DES CHAMBRE

	return getNbChambreDouble() + getNbChambreJumeaux() + getNbChambreSimple() + getNbChambreSuite();
    }

    public void menuHotel() { // #### MENU RECEPTION CLIENT
	boolean openClose = true;

	while (openClose != false) {

	    System.out.println("");
	    System.out.println("############### MENU HOTEL CDA JAVA ###############");
	    System.out.println("");
	    System.out.println("A - Afficher l'état de l'hotel ");
	    System.out.println("B - Afficher le nombre de chambres réservées ");
	    System.out.println("C - Afficher le le nombre de chambres libres ");
	    System.out.println("D - Afficher le numéro de la première chambre vide ");
	    System.out.println("E - Afficher le numéro de la dernière chambre vide ");
	    System.out.println("F - Réserver une chambre ");
	    System.out.println("G - Libérer une chambre ");
	    System.out.println("");
	    System.out.println("Q - Quitter ");
	    System.out.println("");
	    System.out.println("###################################################");
	    System.out.println("");
	    System.out.println("Votre choix : ");

	    String lt = sc.next();

	    String ltMin = lt.toLowerCase(); // transform la lettre en minuscule

	    switch (ltMin) {
	    case "a":
		System.out.println("");
		System.out.println(toString());
		break;
	    case "b":
		System.out.println("b");
		break;
	    case "c":
		System.out.println("c");
		break;
	    case "d":
		afficher1ereChambreVide();
		break;
	    case "e":
		System.out.println("e");
		break;
	    case "f":
		System.out.println("f");
		break;
	    case "g":
		System.out.println("g");
		break;
	    case "q":
		openClose = false;
		break;
	    default:
		System.out.println("404");
		break;

	    }
	}
    }

// ######################################### acceseur & mutateur #########################################
    public ArrayList<chambre> getListChambre() {
	return listChambre;
    }

    public void setListChambre(ArrayList<chambre> listChambre) {
	this.listChambre = listChambre;
    }

    public int getNbChambreSimple() {
	return nbChambreSimple;
    }

    public void setNbChambreSimple(int nbChambreSimple) {
	this.nbChambreSimple = nbChambreSimple;
    }

    public int getNbChambreJumeaux() {
	return nbChambreJumeaux;
    }

    public void setNbChambreJumeaux(int nbChambreJumeaux) {
	this.nbChambreJumeaux = nbChambreJumeaux;
    }

    public int getNbChambreDouble() {
	return nbChambreDouble;
    }

    public void setNbChambreDouble(int nbChambreDouble) {
	this.nbChambreDouble = nbChambreDouble;
    }

    public int getNbChambreSuite() {
	return nbChambreSuite;
    }

    public void setNbChambreSuite(int nbChambreSuite) {
	this.nbChambreSuite = nbChambreSuite;
    }

    public int getNbChambreHotel() {
	return nbChambreHotel;
    }

    public void setNbChambreHotel(int nbChambreHotel) {
	this.nbChambreHotel = nbChambreHotel;
    }

    public String getNomHotel() {
	return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
	this.nomHotel = nomHotel;
    }

// ############################################## toString ###############################################
    @Override
    public String toString() {
	return nomHotel + "\n\r nombre de chambre: " + "\n\r - Chambre simple: " + nbChambreSimple
		+ "\n\r - Chambre jumeaux: " + nbChambreJumeaux + "\n\r - Chambre double: " + nbChambreDouble
		+ "\n\r - Chambre suite: " + nbChambreSuite + "\n\r - Chambre de l'hotel: " + nombreChambreHotel();
    }

}
