package fr.maxime.entity;

public class Bateau extends Vehicule {
    private static int totalBateaux = 0;
    private double longueur;

    public Bateau(String marque, String modele, int annee, double longueur) {
        super(marque, modele, annee);
        this.longueur = longueur;
        totalBateaux++;
    }

    public static int getTotalBateaux() {
        return totalBateaux;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Longueur: " + longueur + " mètres");
    }

    public void jeterAncre() {
        System.out.println(getModele() + " jette l'ancre.");
    }
}

