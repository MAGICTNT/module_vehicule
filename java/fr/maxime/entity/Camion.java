package fr.maxime.entity;

public class Camion extends Vehicule {
    private static int totalCamions = 0;
    private int capaciteCharge;

    public Camion(String marque, String modele, int annee, int capaciteCharge) {
        super(marque, modele, annee);
        this.capaciteCharge = capaciteCharge;
        totalCamions++;
    }

    public static int getTotalCamions() {
        return totalCamions;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Capacité de charge: " + capaciteCharge + " tonnes");
    }

    public void charger() {
        System.out.println(getModele() + " est en train de charger.");
    }
}
