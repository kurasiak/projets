package ExercicesOrienteObjet;

// L’objet de cet exercice est d’écrire la classe décrivant les auteurs. 
// Ces derniers sont caractérisés par les informations suivantes : référence, nom, prénom, nationalité et âge. 

// Écrivez la classe Auteur en respectant les exigences suivantes :
public class Auteur {

// 1. tous les attributs doivent être privés ;
    private int reference;
    private String nom;
    private String prenom;
    private String nationalité;
    private int age;

// 2. un constructeur public initialisant tous les attributs (les paramètres doivent avoir exactement les mêmes noms que les attributs) ;
    public Auteur(int reference, String nom, String prenom, String nationalité, int age) {
	super();
	this.reference = reference;
	this.nom = nom;
	this.prenom = prenom;
	this.nationalité = nationalité;
	this.age = age;
    }

// 3. la présence d’un accesseur public (getter) pour chaque attribut ;
// 4. un mutateur public (setter) pour uniquement l’âge ;
    public int getReference() {
	return reference;
    }

    public void setReference(int reference) {
	this.reference = reference;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getPrenom() {
	return prenom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

    public String getNationalité() {
	return nationalité;
    }

    public void setNationalité(String nationalité) {
	this.nationalité = nationalité;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

// 5. la présence d’une méthode publique toString pour afficher les informations d’un auteur;
    @Override
    public String toString() {
	return "Auteur [reference=" + reference + ", nom=" + nom + ", prenom=" + prenom + ", nationalité=" + nationalité
		+ ", age=" + age + "]";
    }

// 6. la présence d’une méthode publique equals : ...
    public boolean equals(Auteur a) {

// ... deux auteurs sont égaux s’ils possèdent la même référence.
	if (this.reference == a.reference) {
	    return true;
	} else {
	    return false;
	}
    }
}
