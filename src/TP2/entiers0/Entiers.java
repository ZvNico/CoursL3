package TP2.entiers0;

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
        if (index < entiers.length) {
            entiers[index] = x;
            for (int i = index + 1; i < entiers.length; i++) {
                if (entiers[i] == 0) {
                    index = i;
                    break;
                }
            }
        } else {
            System.out.println("Le tableau est plein");
        }
    }

    @Override
    public String toString() {
        String tab = "[ ";
        for (int i : entiers) {
            tab += i + " ";
        }
        tab += "]";
        return tab;
    }

}
