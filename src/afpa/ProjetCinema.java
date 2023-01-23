package afpa;

import java.util.Scanner;

public class ProjetCinema {
    static String[] table = new String[10];
    static int history = 0;
    static int salle1 = 10, salle2 = 15, salle3 = 05;
    static int price1 = 7, price2 = 5, price3 = 10;
    static int nbReset1 = 10, nbReset2 = 15, nbReset3 = 05;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { // **** CONSOLE
	// TODO Auto-generated method stub
	boolean close = true, closeMenu;

	while (close != false) { // **************** MENU
	    System.out.println("");
	    System.out.println("Menu: ");
	    System.out.println("0 - Quitter le menu ");
	    System.out.println("1 - film Les sept samouraïs ");
	    System.out.println("2 - film 8 1/2 ");
	    System.out.println("3 - film Nostalghia ");
	    System.out.println("4 - pouvoir vider la salle ");
	    System.out.println("5 - rubrique Historique ");
	    System.out.println("--- Indiqué votre choix: ");
	    int choice = sc.nextInt();

	    switch (choice) { // ******************* FONCTION_MENU
	    case 0:
		close = false;
		break;
	    case 1:
		closeMenu = true;
		while (closeMenu != false) {
		    System.out.println("1 - film Les sept samouraïs");
		    System.out.println("--- " + salle1 + "/10 places pour 07€  la place");
		    System.out.println("--- 1 pour valider 0 quitter");
		    int confirmation = sc.nextInt();
		    switch (confirmation) {
		    case 0:
			closeMenu = false;
			break;
		    case 1:
			filmLesSeptSamouraïs();
			break;
		    }
		}

		break;
	    case 2:
		closeMenu = true;
		while (closeMenu != false) {
		    System.out.println("2 - film 8 1/2");
		    System.out.println("--- " + salle2 + "/15 places pour 05€  la place");
		    System.out.println("--- 1 pour valider 0 quitter");
		    int confirmation = sc.nextInt();
		    switch (confirmation) {
		    case 0:
			closeMenu = false;
			break;
		    case 1:
			film8_1_2();
			break;
		    }
		}

		break;
	    case 3:
		closeMenu = true;
		while (closeMenu != false) {
		    System.out.println("3 - film Nostalghia");
		    System.out.println("--- " + salle3 + "/05 places pour 10€  la place");
		    System.out.println("--- 1 pour valider 0 quitter");
		    int confirmation = sc.nextInt();
		    switch (confirmation) {
		    case 0:
			closeMenu = false;
			break;
		    case 1:
			filmNostalghia();
			break;
		    }
		}

		break;
	    case 4:
		System.out.println("4 - pouvoir vider la salle");
		Reset();
		break;
	    case 5:
		System.out.println("5 - rubrique Historique");
		history();
		break;
	    }
	}
    }

    public static void history() {
//nonfilm,tarif,placerestante,place
	if (history <= 10) {
	    history = 0;
	} else {
	    for (int i = history; i < table.length; i++) {
		System.out.println(table[i]);
	    }
	}
    }

    public static void pay(double a) { // **** CHOIX_MULTIPLE_PAYMENT
	double payCalibrate = 0;
	boolean close = true;

	while (close != false) { // ********** MENU

	    System.out.println("");
	    System.out.println("0 - quitter: ");
	    System.out.println("1 - payer en une fois: ");
	    System.out.println("2 - payer en plusieur: ");
	    System.out.println("--- Indiqué votre choix: ");
	    int choice = sc.nextInt();

	    switch (choice) { // ************* CHOIX_MENU
	    case 0:
		close = false;
		addSeat(a);
		break;
	    case 1:
		System.out.println("");
		System.out.println("en une fois: " + a);
		break;
	    case 2:
		System.out.println("");
		System.out.println("payer en plusieur: ");
		int nb = sc.nextInt();
		payCalibrate = a / nb;
		System.out.println("payer en plusieur: " + payCalibrate + " sur " + a + "€.");
		break;
	    }
	}
    }

    public static void addSeat(double a) {
	double sum = 0;
	if (a % price1 == 0) {
	    sum = a / price1;
	    salle1 += sum;
	} else if (a % price2 == 0) {
	    sum = a / price2;
	    salle2 += sum;
	} else if (a % price3 == 0) {
	    sum = a / price3;
	    salle3 += sum;
	}
    }

    public static void Reset() { // **** REMISE_ZERO_SALLE
	boolean close = true;
	int confirmation = 2;

	System.out.println("0 - quitter");
	System.out.println("1 - remise a zero salle 1 / " + salle1);
	System.out.println("2 - remise a zero salle 2 / " + salle2);
	System.out.println("3 - remise a zero salle 3 / " + salle3);
	System.out.println("--- Indiqué votre choix: ");
	int choice = sc.nextInt();

	while (close != false) {
	    switch (choice) {
	    case 0:
		close = false;
		break;
	    case 1:
		System.out.println("1 - remise a zero salle 1");
		System.out.println("--- confirmation, taper 1, 0 pour quitter");
		confirmation = sc.nextInt();
		switch (confirmation) {
		case 0:
		    close = false;
		    break;
		case 1:
		    salle1 = nbReset1;
		    break;
		}

		break;
	    case 2:
		System.out.println("2 - remise a zero salle 2");
		System.out.println("--- confirmation, taper 1, 0 pour quitter");
		confirmation = sc.nextInt();
		switch (confirmation) {
		case 0:
		    close = false;
		    break;
		case 1:
		    salle2 = nbReset2;
		    break;
		}

		break;
	    case 3:
		System.out.println("3 - remise a zero salle 3");
		System.out.println("--- confirmation, taper 1, 0 pour quitter");
		confirmation = sc.nextInt();
		switch (confirmation) {
		case 0:
		    close = false;
		    break;
		case 1:
		    salle3 = nbReset3;
		    break;
		}

		break;
	    }
	}
    }

    public static void filmLesSeptSamouraïs() { // **** SALLE_1
	double price = 7.0, sum = 0.0;

	System.out.println("Nombre de place: ");
	int nb = sc.nextInt();

	if (salle1 >= nb) {
	    sum = price * nb;
	    salle1 -= nb;

	    System.out.println("");
	    System.out.println("Salle 1.");
	    System.out.println("Prix: " + sum);
	    pay(sum);
	} else {
	    System.out.println("404");
	}
	table[history] = "filmLesSeptSamouraïs";
	history++;
    }

    public static void film8_1_2() { // **** SALLE_2
	double price = 5.0, sum = 0.0;

	System.out.println("Nombre de place: ");
	int nb = sc.nextInt();

	if (salle2 >= nb) {
	    sum = price * nb;
	    salle2 -= nb;

	    System.out.println("");
	    System.out.println("Salle 2.");
	    System.out.println("Prix: " + sum);
	    pay(sum);
	} else {
	    System.out.println("404");
	}
	table[history] = "filmLesSeptSamouraïs";
	history++;
    }

    public static void filmNostalghia() { // **** SALLE_3
	double price = 10.0, sum = 0.0;

	System.out.println("Nombre de place: ");
	int nb = sc.nextInt();

	if (salle3 >= nb) {
	    sum = price * nb;
	    salle3 -= nb;

	    System.out.println("");
	    System.out.println("Salle 3.");
	    System.out.println("Prix: " + sum);
	    pay(sum);
	} else {
	    System.out.println("404");
	}
	table[history] = "filmLesSeptSamouraïs";
	history++;
    }
}
