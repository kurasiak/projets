package ExercicesOrienteObjet;

public class Personne {

    private String nom; // *********************** ATTRIBUTS
    private int age; // ************************** ATTRIBUTS
    public String prenom; // ********************* ATTRIBUTS

    public Personne() { // *********************** CONSTRUCTEUR_DEFAUT
    }

    public Personne(String nom, int age) { // **** CONSTRUCTEUR_DEUXIEME
	this.nom = nom;
	this.age = age;
    }

    public String getNom() { // ******************* METHODES_GETTEURS
	return nom;
    }

    public void setNom(String nom) { // ************ METHODES_SETTERS
	this.nom = nom;
    }

    public int getAge() { // *********************** METHODES_GETTEURS
	return age;
    }

    public void setAge(int age) { // *************** METHODES_SETTERS
	this.age = age;
    }

    public void afficher() { // ******************** METHODES
	System.out.println(this.nom + this.age);
    }
}
