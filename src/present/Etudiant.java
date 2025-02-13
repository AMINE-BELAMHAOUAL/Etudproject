package present;

import metier.Filiere;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String matricule;
    private Filiere filiere; // Utilisation de l'énumération

    // Constructeur
    public Etudiant(int id, String nom, String prenom, String matricule, Filiere filiere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.filiere = filiere;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
