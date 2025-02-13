import metier.EtudiantMetier;
import metier.Filiere;
import present.Etudiant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher tous les étudiants");
            System.out.println("3. Rechercher un étudiant par ID");
            System.out.println("4. Supprimer un étudiant");
            System.out.println("5. Modifier un étudiant");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la ligne restante

            switch (choix) {
                case 1: // Ajouter un étudiant
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consommer le retour à la ligne
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Matricule : ");
                    String matricule = scanner.nextLine();

                    // Choisir une filière parmi les options
                    System.out.println("Choisissez une filière : ");
                    for (Filiere f : Filiere.values()) {
                        System.out.println("- " + f);
                    }
                    String filiereInput = scanner.nextLine().toUpperCase();
                    Filiere filiere = Filiere.valueOf(filiereInput);  // Convertir la saisie en enum

                    Etudiant etudiant = new Etudiant(id, nom, prenom, matricule, filiere);
                    EtudiantMetier.ajouterEtudiant(etudiant);
                    System.out.println("Étudiant ajouté avec succès.");
                    break;

                case 2: // Afficher tous les étudiants
                    System.out.println("\nListe des étudiants : ");
                    for (Etudiant e : EtudiantMetier.getTousLesEtudiants()) {
                        System.out.println(e);
                    }
                    break;

                case 3: // Rechercher un étudiant par ID
                    System.out.print("Entrez l'ID de l'étudiant à rechercher : ");
                    int rechercheId = scanner.nextInt();
                    scanner.nextLine();  // Consommer la ligne restante
                    Etudiant etudiantTrouve = EtudiantMetier.getEtudiantById(rechercheId);
                    if (etudiantTrouve != null) {
                        System.out.println("Étudiant trouvé : " + etudiantTrouve);
                    } else {
                        System.out.println("Aucun étudiant trouvé avec cet ID.");
                    }
                    break;

                case 4: // Supprimer un étudiant
                    System.out.print("Entrez l'ID de l'étudiant à supprimer : ");
                    int idASupprimer = scanner.nextInt();
                    scanner.nextLine();  // Consommer la ligne restante
                    boolean supprimé = EtudiantMetier.supprimerEtudiant(idASupprimer);
                    if (supprimé) {
                        System.out.println("Étudiant supprimé avec succès.");
                    } else {
                        System.out.println("Aucun étudiant trouvé avec cet ID.");
                    }
                    break;

                case 5: // Modifier un étudiant
                    System.out.print("Entrez l'ID de l'étudiant à modifier : ");
                    int idAModifier = scanner.nextInt();
                    scanner.nextLine();  // Consommer la ligne restante
                    System.out.print("Nouveau nom : ");
                    String nouveauNom = scanner.nextLine();
                    System.out.print("Nouveau prénom : ");
                    String nouveauPrenom = scanner.nextLine();
                    System.out.print("Nouveau matricule : ");
                    String nouveauMatricule = scanner.nextLine();
                    System.out.print("Choisissez une nouvelle filière : ");
                    for (Filiere f : Filiere.values()) {
                        System.out.println("- " + f);
                    }
                    String nouvelleFiliereInput = scanner.nextLine().toUpperCase();
                    Filiere nouvelleFiliere = Filiere.valueOf(nouvelleFiliereInput);  // Convertir la saisie en enum

                    boolean modifié = EtudiantMetier.modifierEtudiant(idAModifier, nouveauNom, nouveauPrenom, nouveauMatricule, nouvelleFiliere);
                    if (modifié) {
                        System.out.println("Étudiant modifié avec succès.");
                    } else {
                        System.out.println("Aucun étudiant trouvé avec cet ID.");
                    }
                    break;

                case 6: // Quitter
                    System.out.println("Au revoir!");
                    continuer = false;
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }

            // Demander si l'utilisateur veut refaire le traitement
            if (continuer) {
                System.out.print("\nVoulez-vous refaire une autre opération ? (oui/non) : ");
                String reponse = scanner.nextLine();
                if (!reponse.equalsIgnoreCase("oui")) {
                    continuer = false;
                    System.out.println("Au revoir!");
                }
            }
        }

        scanner.close();
    }
}
