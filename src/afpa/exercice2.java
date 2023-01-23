package afpa;

import java.util.Scanner;

public class exercice2 {
//    Ecrire un programme java qui demande un nombre à l'utilisateur, puis qui calcule et  affiche le 
//    carré de ce nombre.

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	double sum = 0.0, exhibitor = 2.0;

	System.out.println("Veuiller écrire un nombre: ");
	int nb = sc.nextInt();

	sum = Math.pow(nb, exhibitor);

	System.out.println("");
	System.out.println("le carrée du nombre et: " + sum);

	sc.close();
    }

}
