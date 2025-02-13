package metier;

import present.Etudiant;
import java.util.ArrayList;
import java.util.List;


public class EtudiantMetier {
    private static List<Etudiant> etudiants = new ArrayList<>(); // Liste statique

    public static void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public static Etudiant getEtudiantById(int id) {
        for (Etudiant e : etudiants) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null; // Si aucun étudiant trouvé
    }

    public static List<Etudiant> getTousLesEtudiants() {
        return new ArrayList<>(etudiants);
    }

    public static boolean supprimerEtudiant(int id) {
        return etudiants.removeIf(e -> e.getId() == id);
    }

    public static boolean modifierEtudiant(int id, String nom, String prenom, String matricule, Filiere filiere) {
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
