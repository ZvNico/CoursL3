package TP2;

public class Compteur {
    public static final int LIMITE = 1000;
    private double total;
    private double partiel;

    public static void main(String[] args) {
        testCompteur();
    }

    public static void testCompteur() {
        Compteur compteur = new Compteur();
        System.out.println(compteur);
        compteur.add(200);
        System.out.println(compteur);
        compteur.add(300);
        System.out.println(compteur);
        compteur.resetPartiel();
        System.out.println(compteur);
        compteur.add(150);
        System.out.println(compteur);
    }

    public Compteur() {
        total = 0;
        partiel = 0;
    }

    public double getPartiel() {
        return partiel;
    }

    public double getTotal() {
        return total;
    }

    public void setPartiel(double partiel) {
        this.partiel = partiel;
    }

    public void resetPartiel() {
        partiel = 0;
    }

    public void add(double x) {
        partiel += x;
        total += x;
        if (partiel >= LIMITE) {
            partiel -= LIMITE;
        }
    }

    public String toString() {
        return "compteur = [ totalisateur = " + total +" | partiel = " + partiel +" ]";
    }
}
