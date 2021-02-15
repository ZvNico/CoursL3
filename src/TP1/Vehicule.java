package TP1;

public class Vehicule {
    static int nombre = 0;
    private String marque;
    private final int puissanceFiscale;
    private int vitesseMaximal;
    private int vitesseCourante;

    public Vehicule(final String marque, final int puissanceFiscale) {
        this.marque = marque;
        this.puissanceFiscale = puissanceFiscale;
        nombre++;
    }

    public void demarrer() {
        this.vitesseCourante = 100;
    }

    public void accelerer(double pourcentage) {
        vitesseCourante *= (1 + pourcentage / 100);
    }

    public void avancer() {

    }

    public void reculer() {

    }

    public int getVitesseCourante() {
        return vitesseCourante;
    }

    public void setVitesseCourante(int vitesseCourante) {
        this.vitesseCourante = vitesseCourante;
    }

    public static int getNombre() {
        return nombre;
    }

}
