import metier.EtudiantMetier;
import present.Etudiant;

public class Main {
    public static void main(String[] args) {
        EtudiantMetier gestion = new EtudiantMetier();

        // Ajouter des étudiants
        gestion.ajouterEtudiant(new Etudiant("Ali", "Karim", "AB123", "Informatique"));
        gestion.ajouterEtudiant(new Etudiant("Sara", "Mehdi", "CD456", "Mathématiques"));

        // Afficher tous les étudiants
        System.out.println("Liste des étudiants :");
        for (Etudiant e : gestion.getTousLesEtudiants()) {
            System.out.println(e);
        }

        // Modifier un étudiant
        gestion.modifierEtudiant(1, "Ali", "Karim", "AB999", "Informatique");

        // Supprimer un étudiant
        gestion.supprimerEtudiant(2);

        // Afficher les étudiants après modifications
        System.out.println("Après modification et suppression :");
        for (Etudiant e : gestion.getTousLesEtudiants()) {
            System.out.println(e);
        }
    }
}
