package afpa;

import java.util.Scanner;

public class exercice3 {
//    Ecrire un programme qui demande son prénom à l'utilisateur, et qui lui réponde par  « Bonjour » 
//    suivi du prénom.

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("Informer votre prenom: ");
	String prenom = sc.next();

	System.out.println("");
	System.out.println("Bonjour, " + prenom);

	sc.close();
    }

}
