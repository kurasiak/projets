package afpa;

import java.util.Scanner;

class excercice5 {
//    On désire écrire un programme qui, à partir d'un chiffre entré au clavier, permet d’afficher le jour 
//    correspondant à un chiffre allant de 1 à 7. 

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("Indiquer un nombre: ");
	int nb = sc.nextInt();

	switch (nb) {
	case 1:
	    System.out.println("");
	    System.out.println("lundi");
	    break;
	case 2:
	    System.out.println("");
	    System.out.println("mardi");
	    break;
	case 3:
	    System.out.println("");
	    System.out.println("mercrei");
	    break;
	case 4:
	    System.out.println("");
	    System.out.println("jeudi");
	    break;
	case 5:
	    System.out.println("");
	    System.out.println("vendredi");
	    break;
	case 6:
	    System.out.println("");
	    System.out.println("samedi");
	    break;
	case 7:
	    System.out.println("");
	    System.out.println("dimanche");
	    break;
	}

	sc.close();
    }

}
