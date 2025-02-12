package present;

public class Etudiant {
    private static int idCounter = 0;
    private int id;
    private String nom;
    private String prenom;
    private String matricule;
    private String filiere;

    // Constructeur avec ID
    public Etudiant(int id, String nom, String prenom, String matricule, String filiere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.filiere = filiere;
    }

    // Constructeur sans ID (auto-incrémenté)
    public Etudiant(String nom, String prenom, String matricule, String filiere) {
        this.id = ++idCounter;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.filiere = filiere;
    }

    // Getters et Setters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getMatricule() { return matricule; }
    public String getFiliere() { return filiere; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
    public void setFiliere(String filiere) { this.filiere = filiere; }

    // toString()
    @Override
    public String toString() {
        return "Etudiant{id=" + id + ", nom='" + nom + "', prenom='" + prenom + "', matricule='" + matricule + "', filiere='" + filiere + "'}";
    }
}

