package fr.maxime;

import fr.maxime.entity.Bateau;
import fr.maxime.entity.Camion;
import fr.maxime.entity.Moto;
import fr.maxime.entity.Voiture;
import fr.maxime.entity.Vehicule;
import fr.maxime.interfaces.IVehicule;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<IVehicule> vehicules = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            int choix = menuPrincipal(scanner);
            switch (choix) {
                case 1:
                    creerVehicule(scanner);
                    break;
                case 2:
                    afficherTotaux();
                    break;
                case 3:
                    afficherTousVehicules();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }

        scanner.close();
    }


    private static void creerVehicule(Scanner scanner) {
        int type = menuVehicule(scanner);
        System.out.print("Entrez la marque: ");
        String marque = scanner.next();
        System.out.print("Entrez le modèle: ");
        String modele = scanner.next();
        System.out.print("Entrez l'année: ");
        int annee = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.print("Entrez le nombre de portes: ");
                int nombrePortes = scanner.nextInt();
                Voiture voiture = new Voiture(marque, modele, annee, nombrePortes);
                vehicules.add(voiture);
                voiture.afficherDetails();
                break;
            case 2:
                System.out.print("La moto a-t-elle un sidecar (true/false) ? ");
                boolean aSidecar = scanner.nextBoolean();
                Moto moto = new Moto(marque, modele, annee, aSidecar);
                vehicules.add(moto);
                moto.afficherDetails();
                break;
            case 3:
                System.out.print("Entrez la capacité de charge (tonnes) : ");
                int capaciteCharge = scanner.nextInt();
                Camion camion = new Camion(marque, modele, annee, capaciteCharge);
                vehicules.add(camion);
                camion.afficherDetails();
                break;
            case 4:
                System.out.print("Entrez la longueur (mètres) : ");
                double longueur = scanner.nextDouble();
                Bateau bateau = new Bateau(marque, modele, annee, longueur);
                vehicules.add(bateau);
                bateau.afficherDetails();
                break;
            default:
                System.out.println("Type de véhicule invalide.");
        }
    }

    /**
     *
     * @param scanner
     * @return retourne un int
     */
    private static int menuPrincipal(Scanner scanner) {
        System.out.println("Menu:");
        System.out.println("1. Créer un nouveau véhicule");
        System.out.println("2. Afficher le total des véhicules");
        System.out.println("3. Afficher tous les véhicules");
        System.out.println("4. Quitter");
        System.out.print("Choisissez une option: ");
        int choix = scanner.nextInt();
        return choix;
    }

    private static int menuVehicule(Scanner scanner) {
        System.out.println("Quel type de véhicule souhaitez-vous créer?");
        System.out.println("1. Voiture");
        System.out.println("2. Moto");
        System.out.println("3. Camion");
        System.out.println("4. Bateau");
        System.out.print("Choisissez une option: ");
        int type = scanner.nextInt();
        return type;
    }

    private static void afficherTotaux() {
        System.out.println("Total des véhicules: " + Vehicule.getTotalVehicules());
        System.out.println("Total des voitures: " + Voiture.getTotalVoitures());
        System.out.println("Total des motos: " + Moto.getTotalMotos());
        System.out.println("Total des camions: " + Camion.getTotalCamions());
        System.out.println("Total des bateaux: " + Bateau.getTotalBateaux());
    }

    private static void afficherTousVehicules() {
        System.out.println("Liste de tous les véhicules:");
        for (IVehicule vehicule : vehicules) {
            vehicule.afficherDetails();
        }
    }
}