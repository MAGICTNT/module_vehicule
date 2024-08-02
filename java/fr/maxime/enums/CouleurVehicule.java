package fr.maxime.enums;

import java.util.HashMap;
import java.util.Map;

public enum CouleurVehicule {
    ROUGE(1, "Rouge"),
    VERT(2, "Vert"),
    BLEU(3, "Bleu");

    private final int id;
    private final String nom;

    CouleurVehicule(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public static Map<Integer, CouleurVehicule> getAllCouleursParId() {
        Map<Integer, CouleurVehicule> mapCouleurs = new HashMap<>();
        for (CouleurVehicule couleur : CouleurVehicule.values()) {
            mapCouleurs.put(couleur.getId(), couleur);
        }
        return mapCouleurs;
    }

    public static CouleurVehicule getCouleurById(int id) {
        Map<Integer, CouleurVehicule> mapCouleurs = getAllCouleursParId();
        return mapCouleurs.get(id);
    }
}