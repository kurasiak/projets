package EmployeSociete;

// Un employé a un nom connu dès sa création et qui ne peut pas changer. 
// Il est caractérisé par son numéro qui lui sera automatiquement attribué à sa création. 
// Un employé est embauché dans une société qui lui verse un salaire ; il ne peut pas changer de société. 
// Le salaire peut être augmenté d'un certain pourcentage. On doit pouvoir savoir si deux employés sont collègues (i.e. travaillent dans la même société). 

// Dans la classe Employe on tient à jour la liste des sociétés qui ont embauché au moins un employé. Cette liste pourra être affichée.
// La classe Employe contiendra les méthodes suivantes : 
public class Employe {

    private String nom;
    private int id;
    private double salaire;
    private static Societe societe;

    public Employe(String nom, int id, double salaire, Societe societe) {
	super();
	this.nom = nom;
	this.id = id;
	this.salaire = salaire;
	Employe.societe = societe;
    }

// 1. public static void afficherListeSociete() 

// 2. public Employe(String nom, Societe s) 
    public Employe(String nom, Societe s) {
	this.nom = nom;
	Employe.societe = s;
	return;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public static void setSociete(Societe societe) {
	Employe.societe = societe;
    }

    // 3. public Societe getSociete()
    public double getSalaire() {
	return salaire;
    }

// 4. public double getSalaire() 
    public void setSalaire(double salaire) {
	this.salaire = salaire;
    }

// 5. public void setSalaire(double salaire) 
    public Societe getSociete() {
	return societe;
    }

// 6. public void augmenterSalaire(double taux) 
    public void augmentaterSalaire(double taux) {
	salaire = salaire + (salaire * (taux / 100));
    }

// 7. public boolean estCollegue(Employe e) 
    public boolean estCollegue(Employe e) {
	if (Employe.societe.equals(e.getSociete())) {
	    return true;
	} else {
	    return false;
	}

    }

// 8. public String toString() 
    @Override
    public String toString() {
	return "Employe [nom=" + nom + ", id=" + id + ", salaire=" + salaire + ", societe=" + societe.getNom() + "]";
    }

}
