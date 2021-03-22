package TP2;


public class Vehicule {
    private static int registre = 0;
    private int immat;
    private Compteur compteur;
    private double jauge;
    private final double capacite = 50;
    private final double conso;

    public static void main(String[] args) {
        Vehicule ve1 = new Vehicule(50);
        Vehicule ve2 = new Vehicule(50);
        ve2.mettreDeLessence(20.2);
        ve1.faireLePlein();
        ve2.rouler(20.5);
        System.out.println(ve2);
    }

    public Vehicule(double conso) {
        registre += 1;
        immat = registre;
        compteur = new Compteur();
        this.conso = conso;
    }

    public double getJauge() {
        return jauge;
    }

    public Compteur getCompteur() {
        return compteur;
    }

    public void mettreDeLessence(double essence) {
        if (jauge + essence > capacite) {
            jauge = capacite;
        } else {
            jauge += essence;
        }
    }

    public void faireLePlein() {
        jauge = capacite;
    }

    public double rouler(double distance) {
        jauge -= distance * conso / 100;
        if (jauge < 0) {
            distance += jauge * 100 / conso;
            jauge = 0;
        }
        compteur.add(distance);
        return distance;
    }

    @Override
    public String toString() {
        return "Vehicule " + immat + " : " + compteur + "; jauge = " + jauge;
    }
}
