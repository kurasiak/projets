package afpa;

import java.util.Scanner;

public class exercie1 {
//    écrire un programme java permettant de demander à l'utilisateur de saisir deux entiers a et b 
//    et les afficher sur la console. échanger les valeurs de a et b.

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("");
	System.out.println("veuillez saisir entiers a: ");
	int nbA = sc.nextInt();

	System.out.println("");
	System.out.println("veuillez saisir entiers a: ");
	int nbB = sc.nextInt();

	System.out.println("la valeur a et: " + nbA + " et la valeur de b et: " + nbB);
	System.out.println("la valeur a et: " + nbB + " et la valeur de b et: " + nbA);

	sc.close();
    }
}