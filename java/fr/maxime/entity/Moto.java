package fr.maxime.entity;

public class Moto extends Vehicule {
    private static int totalMotos = 0;
    private boolean aSidecar;

    public Moto(String marque, String modele, int annee, boolean aSidecar) {
        super(marque, modele, annee);
        this.aSidecar = aSidecar;
        totalMotos++;
    }

    public static int getTotalMotos() {
        return totalMotos;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("A un sidecar: " + (aSidecar ? "Oui" : "Non"));
    }

    public void faireWheelie() {
        System.out.println(getModele() + " fait un wheelie !");
    }
}

