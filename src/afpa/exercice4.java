package afpa;

import java.util.Scanner;

public class exercice4 {
//    Ecrire un programme java qui lit le prix HT d'un article, le nombre d'articles et le taux de TVA, 
//    et qui fournit le prix total TTC correspondant. 

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	double ht = 0.0, tva = 0.0;
	int item = 0;

	calculTva(ht, tva, item);

	sc.close();
    }

    public static void calculTva(double ht, double tva, int item) {

	double ttc = 0;

	System.out.println("indiqué le prix ht: ");
	ht = sc.nextDouble();

	System.out.println("");
	System.out.println("indiqué la tva: ");
	tva = sc.nextDouble();

	System.out.println("");
	System.out.println("indiqué le nombre d'article: ");
	item = sc.nextInt();

	ttc = (ht * (tva / 100) + ht) * item;

	System.out.println("");
	System.out.println("le resultat ttc et: " + ttc);
    }

}
