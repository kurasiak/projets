package afpa;

import java.util.Scanner;

public class Afpa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

//	//exo 1:
//	System.out.println("indiqué valeur A");
//	int a = sc.nextInt();
//
//	System.out.println("indiqué valeur B");
//	int b = sc.nextInt();
//
//	System.out.println("A: " + a + " & B: " + b);

//	// exo 2:
//	int carre = 2;
//
//	System.out.println("indiqué un nombre: ");
//	double nb = sc.nextInt();
//
//	nb = Math.pow(nb, carre);
//
//	System.out.println("la valeur et: " + nb);

//	// exo 3:
//	System.out.println("Bonjour, quel est votre prenom? ");
//	String prenom = sc.next();
//
//	System.out.println("Bonjour, " + prenom + ".");

//	// exo 4:
//	System.out.println("indiqué le prix HT:");
//	double ht = sc.nextInt();
//
//	System.out.println("indiqué le nombre d'article:");
//	int article = sc.nextInt();
//
//	System.out.println("indiqué la TVA:");
//	double tva = sc.nextInt();
//
//	System.out.println("le prix TTC et de: " + ((ht * (tva / 100) + ht)) * article);

//	// exo 5:
//	System.out.println("indiqué votre nombre: ");
//	int nb = sc.nextInt();
//
//	switch (nb) {
//	case 1:
//	    System.out.println(nb + " lundi");
//	    break;
//	case 2:
//	    System.out.println(nb + " mardi");
//	    break;
//	case 3:
//	    System.out.println(nb + " mercredi");
//	    break;
//	case 4:
//	    System.out.println(nb + " jeudi");
//	    break;
//	case 5:
//	    System.out.println(nb + " vendredi");
//	    break;
//	case 6:
//	    System.out.println(nb + " samedi");
//	    break;
//	case 7:
//	    System.out.println(nb + " dimanche");
//	    break;
//	default:
//	    System.out.println(nb + " 404. Nombre entre 1 & 7.");
//	    break;
//	}

	// exo 6:
//	System.out.println("indiqué un nombre: ");
//	double nb = sc.nextDouble();
//
//	double min = nb;
//	double sum = 0;
//
//	while (nb != 0) {
//	    System.out.println("indiqué un nombre: ");
//	    nb = sc.nextDouble();
//	    if (nb != 0) {
//		if (min > nb) {
//		    min = nb;
//		}
//	    }
//	    if (nb > 0) {
//		sum = sum + nb;
//	    }
//	}
//
//	System.out.println(sum);
//	System.out.println(min);

//	// exo 7:
//	System.out.println("indiqué un nombre: ");
//	int nb = sc.nextInt();
//
//	if (nb >= 1) {
//	    int pairsImpair = nb % 2;
//	    if (pairsImpair == 0) {
//		System.out.println("le chiffres " + nb + " pairs. ");
//	    } else {
//		System.out.println("le chiffres " + nb + " impairs: ");
//	    }
//	}

//	// exo 8
//	int nb = 0;
//	int max = 0;
//
//	System.out.println("indiqué le nombre de répétition: ");
//	int choise = sc.nextInt();
//
//	for (int i = 0; i < choise; i++) {
//	    System.out.println("indiqué un nombre: ");
//	    nb = sc.nextInt();
//	    if (nb > max) {
//		max = nb;
//	    }
//	}
//	
//	System.out.println(max);

//	// exo 9:
//	System.out.println("indiqué l'age de l'enfant: ");
//	int nb = sc.nextInt();
//
//	if (nb > 12) {
//	    System.out.println("Cadet");
//	} else {
//	    switch (nb) {
//	    case 6:
//	    case 7:
//		System.out.println("Poussin");
//		break;
//	    case 8:
//	    case 9:
//		System.out.println("Pupille");
//		break;
//	    case 10:
//	    case 11:
//		System.out.println("Minime");
//		break;
//	    default:
//		System.out.println("404");
//		break;
//	    }
//	}

//	// exo 10,11:
//	int integer = 10, sum = 0, nb = 0, max = 0, min = 0, moy = 0;
//	int[] table = new int[integer];
//
//	for (int i = 0; i < integer; i++) {// ************* debut_rentrer_table+max+min+moy
//	    nb = i + 1;
//	    System.out.println("indiqué les valeur du tableau " + nb + ":");
//	    table[i] = sc.nextInt();
//	    if (table[i] > max) {
//		max = table[i];
//	    }
//	    min = table[i];
//	    if (table[i] < min) {
//		min = table[i];
//	    }
//	    moy = table[i] + moy;
//	} // *********************************************** FIN_RENTRER_TABLE+MIN+MAX+MOY
//
//	System.out.println("table");// ***************************** debut_affichage_table
//
//	for (int i = 0; i < integer; i++) {
//	    System.out.println(table[i]);
//	} // ****************************************************** FIN_AFFICHAGETAB_TABLE
//
//	for (int i : table) {// **************************************** debut_calcul_sum
//	    sum = sum + i;
//	} // ************************************************************ FIN_CALCUL_SUM
//
//	System.out.println("Somme: " + sum);
//	System.out.println("Max: " + max);
//	System.out.println("Min: " + min);
//	System.out.println("Moyen: " + moy / integer);

//	// exo 12:
//	int[] table = new int[] { 10, 20, 59, 4, 7, 86, 8, 465, 7, 9 };
//
//	System.out.println("quelle valeur recherchez-vous: ");
//	int nb = sc.nextInt();
//
//	for (int i = 0; i < table.length; i++) {
//	    if (table[i] == nb) {
//		System.out.println(i);
//	    }
//	}

//	// exo 13:
//	int integer = 20, nb = 0, x = 0, tmp = 0;
//	int[] table = new int[integer];
//	int taille = table.length;
//
//	for (int i = 0; i < integer; i++) {// ************* DEBUT_AJOUT_VALEUR
//	    x = i + 1;
//	    System.out.println("entrer vos valeur: " + x);
//	    table[i] = sc.nextInt();
//	} // ********************************************** fin_ajout_valeur
//
//	for (int i = 0; i < taille; i++) {// ************** DEBUT_TRI_BULLE
//	    for (int j = 1; j < (taille - i); j++) {
//		if (table[j - 1] > table[j]) {
//		    tmp = table[j - 1];
//		    table[j - 1] = table[j];
//		    table[j] = tmp;
//		}
//	    }
//	} // ********************************************** fin_tri_bulle
//
//	for (int i = 0; i < integer; i++) {// ************* DEBUT_AFFICHAGE
//	    System.out.println(table[i]);
//	} // ********************************************** fin_affichage

//	// exo 14:
//	int nb = 0;
//
//	while (nb < 1 || nb > 3) {
//	    System.out.println("Indiquer un nombre compirs entre 1 et 3: ");
//	    nb = sc.nextInt();
//	}
//	
//	System.out.println("nombre: " + nb);

//	// exo 15:
//	int nb = 0, min = 10, max = 20;
//
//	while (nb < min || nb > max) {
//	    System.out.println("indiquer un nombre: ");
//	    nb = sc.nextInt();
//	    if (nb > 20) {
//		System.out.println("Plus petit !");
//	    } else if (nb < 10) {
//		System.out.println("Plus grand !");
//	    }
//	}

//	// exo 16:
//	int nb = 0;
//
//	System.out.println("indiqué un nombre: ");
//	nb = sc.nextInt();
//
//	for (int i = 0; i < 10; i++) {
//	    nb++;
//	    System.out.println(nb);
//	}

//	// exo 17:
//	int nb = 0, turn = 11, multiply = 0, sum = 0;
//
//	System.out.println("indiqué un nombre: ");
//	nb = sc.nextInt();
//
//	for (int i = 0; i < turn; i++) {
//	    multiply = i;
//	    sum = nb * multiply;
//	    System.out.println(nb + " x " + multiply + " = " + sum);
//	}

//	// exo 18:
//	int nb = 0, sum = 0;
//
//	System.out.println("indiqué un nombre: ");
//	nb = sc.nextInt();
//
//	for (int i = 0; i < nb; i++) {
//	    System.out.println(sum = i + 1);
//	}

//	// exo 19, 20:
//	int integer = 2;
//	int m = integer, n = integer;
//	int[][] table = new int[m][n];
//
//	for (int i = 0; i < integer; i++) {// ************** DEBUT_SAISIE_DONNEE
//	    for (int j = 0; j < integer; j++) {
//		System.out.println("indiqué une valeur: ");
//		table[i][j] = sc.nextInt();
//	    }
//	} // *********************************************** fin_saisie_donnee
//
//	for (int i = 0; i < table.length; i++) {// ********* parcourir les lignes
//	    for (int j = 0; j < table.length; j++) {// ***** parcourir touts les colonnes d'une ligne dindice i
//		System.out.println(table[i][j]);
//	    }
//	}
//
//	boolean diag = true;
//	for (int i = 0; i < table.length; i++) {
//	    for (int j = 0; j < table.length; j++) {
//		if (i != j) {
//		    if (table[i][j] != 0)
//			diag = false;
//		}
//	    }
//	}
//
//	System.out.println(diag);

//	// exo 23:
//	int integer = 2;
//	int[][] A1 = new int[integer][integer];
//	int[][] A2 = new int[integer][integer];
//	int[][] A3 = new int[integer][integer];
//
//	for (int i = 0; i < integer; i++) {
//	    for (int j = 0; j < integer; j++) {
//		System.out.println("indiqué un nombre pour A1:");
//		A1[i][j] = sc.nextInt();
//	    }
//	}
//
//	for (int i = 0; i < integer; i++) {
//	    for (int j = 0; j < integer; j++) {
//		System.out.println("indiqué un nombre pour A2:");
//		A2[i][j] = sc.nextInt();
//	    }
//	}
//
//	for (int i = 0; i < integer; i++) {
//	    for (int j = 0; j < integer; j++) {
//
//		System.out.println(A3[i][j] = A1[i][j] * A2[i][j]);
//	    }
//	}

//	// exo 24:
//	int jour1 = 0, mois1 = 0, annee1 = 0, jour2 = 0, mois2 = 0, annee2 = 0, point = 0;
//
//	while (jour1 == 0 || mois1 == 0) {// *********************************** DATE_1
//	    System.out.println("ecrire le jour de la date 1");
//	    jour1 = sc.nextInt();
//	    if (jour1 != 0 && jour1 >= 1 && jour1 <= 31) {
//		System.out.println("ecrire le jour de la mois 1");
//		mois1 = sc.nextInt();
//	    }
//	    if (mois1 != 0 && mois1 >= 1 && mois1 <= 12) {
//		System.out.println("ecrire le jour de la année 1");
//		annee1 = sc.nextInt();
//	    }
//	}
//
//	while (jour2 == 0 || mois2 == 0) {// *********************************** DATE_2
//	    System.out.println("ecrire le jour de la date 2");
//	    jour2 = sc.nextInt();
//	    if (jour2 != 0 && jour2 >= 1 && jour2 <= 31) {
//		System.out.println("ecrire le jour de la mois 2");
//		mois2 = sc.nextInt();
//	    }
//	    if (mois2 != 0 && mois2 >= 1 && mois2 <= 12) {
//		System.out.println("ecrire le jour de la année 2");
//		annee2 = sc.nextInt();
//	    }
//	}
//
//	if (annee1 < annee2) {// *********************************************** ANNEE_SUPERIEUR
//	    point = 2;
//	} else if (annee1 == annee2) {
//	    if (mois1 < mois2) {// ********************************************* MOIS_SUPERIEUR
//		point = 2;
//	    } else if (mois1 == mois2) {
//		if (jour1 < jour2) {// ***************************************** JOUR_SUPERIEUR
//		    point = 2;
//		} else if (jour1 == jour2) {
//		    point = 1;
//		} else {
//		    point = -2;
//		}
//	    } else {
//		point = -2;
//	    }
//	} else {
//	    point = -2;
//	}
//
//	switch (point) {// ******************************************************* REPONSE_SUPERIEUR
//	case 2:
//	    System.out.println("date 1, c'est la plus elever");
//	    break;
//	case 1:
//	    System.out.println("elles sont egaux");
//	    break;
//	case -2:
//	    System.out.println("date 2, c'est la plus elever");
//	    break;
//	}
//
//	System.out.println("date 1: " + jour1 + " / " + mois1 + " / " + annee1);
//	System.out.println("date 2: " + jour2 + " / " + mois2 + " / " + annee2);

//	// exo 25:
//	int age = 0;
//	double prix = 0, sum = 0, discount = 0;
//
//	System.out.println("indiqué un age:");
//	age = sc.nextInt();
//	System.out.println("indiqué un prix:");
//	prix = sc.nextDouble();
//
//	if (age < 2) {
//	    sum = 0;
//	} else if (age < 10) {
//	    sum = prix / 2;
//	} else if (age < 27 || age > 70) {
//	    discount = prix * (10.0 / 100.0);
//	    sum = prix - discount;
//	}
//
//	System.out.println(sum + "€");

//	// exo 26, 27:
//	int age = 0;
//	float account = 0;
//
//	System.out.println("indiqué l'age:");
//	age = sc.nextInt();
//
//	for (int i = 0; i < age; i++) {
//	    account = 100 + (age * 2) + account;
//	}
//
//	System.out.println(account);

//	// exo 28:
//	double alphaPop = 10000000, alphaBoost = 500000;
//	double betaPop = 5000000, betaBoost = 3.0, sum = 0;
//	int annee = 0;
//
//	while (alphaPop > betaPop) {
//	    annee = annee + 1;
//
//	    sum = betaPop * (betaBoost / 100.0);
//
//	    alphaPop = alphaPop + alphaBoost;
//	    betaPop = betaPop + sum;
//	}
//
//	System.out.println("alpha: " + alphaPop);
//	System.out.println("beta: " + betaPop);
//	System.out.println("annee: " + annee);

//	// exo 29:
//	String password = "Password", answer = "titi", user = "";
//
//	for (int i = 0; i < 3; i++) { // ****************************************** POSSIBLITEE
//
//	    System.out.println(" ");// ******************************************** CONNECTION
//	    System.out.println("Bonjour, indiqué votre mot de passe, stp: ");
//	    user = sc.next();
//
//	    if (user.equals(password)) { // *************************************** VALIDATION
//		System.out.println("Succès de l’authentification. ");
//		break;
//	    } else {
//		System.out.println("bloqué. ");
//	    }
//	}
//
//	System.out.println(" "); // *********************************************** SECONDE_CHANCE
//	System.out.println("Risque d'étre bloqué. ");
//	System.out.println("Répondre à la question: Dessin annimé american ____ et grominer? ");
//	user = sc.next();
//
//	if (user.equals(answer)) {
//	    System.out.println("Succès de l’authentification. ");
//	} else {
//	    System.out.println("définitivement refusé. ");
//	}

	sc.close();
    }

}
