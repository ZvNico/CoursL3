package TP2.Simon;

public class Entiers {
    public static final int TAILLE = 5;
    private int[] entiers;
    private int index;

    public Entiers() {
        index = 0;
        entiers = new int[TAILLE];
    }

    public Entiers(int[] args) {
        entiers = args;
        index = args.length;
        entiers[index - 1] = 666;
    }

    public void add(int x) {
        if (this.entiers[index] != 0) {
            System.out.println(" Le tableau est plein");
        } else {
            entiers[index] = x;
        }
    }

    @Override
    public String toString() {
        String chaine = "[ ";
        for (int entier : entiers) {
            chaine = chaine + entier + " ";
        }
        chaine = chaine = "]";
        return chaine;
    }


}
