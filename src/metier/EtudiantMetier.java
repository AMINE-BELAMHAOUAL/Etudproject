package metier;
import present.Etudiant;
import java.util.ArrayList;
import java.util.List;

public class EtudiantMetier {
    private List<Etudiant> etudiants;

    // Constructeur
    public EtudiantMetier() {
        this.etudiants = new ArrayList<>();
    }

    // Ajouter un étudiant
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    // Sélectionner un étudiant par ID
    public Etudiant getEtudiantById(int id) {
        for (Etudiant e : etudiants) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null; // Si aucun étudiant trouvé
    }

    // Sélectionner tous les étudiants
    public List<Etudiant> getTousLesEtudiants() {
        return new ArrayList<>(etudiants);
    }

    // Sélectionner les étudiants d'une filière
    public List<Etudiant> getEtudiantsParFiliere(String filiere) {
        List<Etudiant> resultat = new ArrayList<>();
        for (Etudiant e : etudiants) {
            if (e.getFiliere().equalsIgnoreCase(filiere)) {
                resultat.add(e);
            }
        }
        return resultat;
    }

    // Sélectionner les étudiants par matricule
    public List<Etudiant> getEtudiantsParMatricule(String prefix) {
        List<Etudiant> resultat = new ArrayList<>();
        for (Etudiant e : etudiants) {
            if (e.getMatricule().startsWith(prefix)) {
                resultat.add(e);
            }
        }
        return resultat;
    }

    // Supprimer un étudiant
    public boolean supprimerEtudiant(int id) {
        return etudiants.removeIf(e -> e.getId() == id);
    }

    // Modifier un étudiant
    public boolean modifierEtudiant(int id, String nom, String prenom, String matricule, String filiere) {
        for (Etudiant e : etudiants) {
            if (e.getId() == id) {
                e.setNom(nom);
                e.setPrenom(prenom);
                e.setMatricule(matricule);
                e.setFiliere(filiere);
                return true;
            }
        }
        return false;
    }
}
