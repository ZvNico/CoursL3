package TP1;

public class Main {

    public static void main(String[] args) {
        Vehicule moto = new Vehicule("Suzuki", 300);
        Vehicule voiture = new Vehicule("Renault", 200);
        System.out.println(Vehicule.getNombre());
        moto.demarrer();
        System.out.println(moto.getVitesseCourante());
        moto.accelerer(50);
        System.out.println(moto.getVitesseCourante());
    }
}
