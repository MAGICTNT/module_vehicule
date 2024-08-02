package fr.maxime.entity;

import fr.maxime.interfaces.IVehicule;

public class Vehicule implements IVehicule {
    private static int totalVehicules = 0;
    private String marque;
    private String modele;
    private int annee;

    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        totalVehicules++;
    }

    public static int getTotalVehicules() {
        return totalVehicules;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Marque: " + marque + ", Modèle: " + modele + ", Année: " + annee);
    }

    @Override
    public void demarrer() {
        System.out.println(modele + " démarre.");
    }

    @Override
    public void arreter() {
        System.out.println(modele + " s'arrête.");
    }
}

