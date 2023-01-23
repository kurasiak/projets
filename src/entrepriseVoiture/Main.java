package entrepriseVoiture;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	float diametre = 16;
	String color = "noir";
	int numero = 55;

//	roue
	Roue r1 = new Roue(1, diametre);
	Roue r2 = new Roue(2, diametre);
	Roue r3 = new Roue(3, diametre);
	Roue r4 = new Roue(4, diametre);
	Roue r5 = new Roue(5, diametre);

//	affichage rue
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	System.out.println("");

//	voiture
	Voiture v1 = new Voiture(numero, null, color);

//	affichage voiture
	System.out.println(v1);
	System.out.println("");

//	ajout roue
	v1.ajoutRoue(r1);
	v1.ajoutRoue(r2);
	v1.ajoutRoue(r3);
	v1.ajoutRoue(r4);

//	affichage ajout roue
	System.out.println("");
	System.out.println(r1.toString());
	System.out.println(r2.toString());
	System.out.println(r3.toString());
	System.out.println(r4.toString());
	System.out.println(r5.toString());
    }

}
