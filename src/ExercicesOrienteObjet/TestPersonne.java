package ExercicesOrienteObjet;

public class TestPersonne {

    public static void main(String[] args) { // ********************* METHODE_MAIN()
	// TODO Auto-generated method stub

	Personne personne = new Personne(); // ********************** INSTANCE_OBJET_DEFAUT_CONSTRUCTEUR

	Personne personne1 = new Personne("Pierre ", 23); // ******** INSTANCE_DEUXIEME_CONSTRUCTUEUR
	Personne personne2 = new Personne("Christophe ", 45); // **** INSTANCE_DEUXIEME_CONSTRUCTUEUR
	Personne personne3 = new Personne("Remi ", 25);
	Personne personne4 = new Personne("Joe ", 3);
	Personne personne5 = new Personne("Eric ", 28);
	Personne personne6 = new Personne("Toto ", 18);

	personne1.setAge(24);
	personne2.setNom("Christian ");

//	personne.afficher();
//	personne1.afficher();
//	personne2.afficher();

	Personne[] table = new Personne[10];

	table[0] = personne1;
	table[1] = personne2;
	table[2] = personne3;
	table[3] = personne4;
	table[4] = personne5;
	table[5] = personne6;

	personne6.setNom("Marie ");

	for (int i = 0; i < table.length; i++) {
	    table[i].afficher();
	}

	int exist = 0;
	for (int i = 0; i < table.length; i++) {
	    if (table[i].equals("Marie")) {
		exist++;
	    }
	}
	if (exist > 0) {
	    System.out.println("existe dans le tableau.");
	} else {
	    System.out.println("n'existe pas dans le tableau.");
	}
    }

}
