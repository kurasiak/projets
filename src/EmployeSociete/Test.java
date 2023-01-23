package EmployeSociete;

public class Test {

// Développez la classe Test.java pour tester les classes Employe et Societe. 
// Vous devez obtenir le résultat suivant :

    public static void main(String[] args) {
	// TODO Auto-generated method stub

//	societe
	Societe sc1 = new Societe("toto");
	Societe sc2 = new Societe("titi");

//	affichage societe
	System.out.println(sc1);
	System.out.println(sc2);
	System.out.println("");

//	employer
	Employe e1 = new Employe("tota", sc1);
	Employe e2 = new Employe("tito", sc2);
	Employe e3 = new Employe("tito", sc2);

	e1.setSalaire(1200);
	e2.setSalaire(1200);
	e3.setSalaire(1200);

	e1.setId(12);
	e2.setId(1012);
	e3.setId(1712);

//	augmantatin d'un employer
	e1.augmentaterSalaire(2);

//	affichage employer
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println("");

//	embocher
	sc1.embaucher(e1);
	sc2.embaucher(e2);
	sc2.embaucher(e3);

//	augmentation generale
	sc2.AugmentationGenerale(4);

//	affichage employer
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println("");

	System.out.println(sc2.getMasseSalariale());
	System.out.println(sc2.toString());

    }

}
