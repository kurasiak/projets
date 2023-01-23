package afpa;

import java.util.Scanner;

public class exercice6 {
//    Ecrire un algorithme permettant de lire une suite de nombres réels et positifs sur le clavier. 
//    Le dernier élément à lire est un zéro. L’algorithme doit afficher le plus petit élément de la suite 
//    ainsi que la somme des éléments lus.

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	numberReal();

	sc.close();
    }

    public static void numberReal() {
	double sum = 0.0, nb = -1.0, min = nb;

	while (nb != 0) {

	    System.out.println("");
	    System.out.println("Indiqué un nombre reel: ");
	    nb = sc.nextDouble();

	    if (nb > 0) {
		sum = nb + sum;
		System.out.println(nb);
	    }

	    if (nb != 0.0 && nb > 0.0) {
		if (min > nb) {
		    min = nb;
		}
	    }

	}

	System.out.println("");
	System.out.println("min: " + min);
	System.out.println("somme: " + sum);
    }
}
