package fr.maxime.entity;

public class Voiture extends Vehicule {
    private static int totalVoitures = 0;
    private int nombrePortes;

    public Voiture(String marque, String modele, int annee, int nombrePortes) {
        super(marque, modele, annee);
        this.nombrePortes = nombrePortes;
        totalVoitures++;
    }

    public static int getTotalVoitures() {
        return totalVoitures;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Nombre de portes: " + nombrePortes);
    }

    public void ouvrirCoffre() {
        System.out.println(this.getModele() + " ouvre le coffre.");
    }
}
