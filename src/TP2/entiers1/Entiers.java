package TP2.entiers1;

public class Entiers {
    public static final int TAILLE = 5;
    private int[] entiers;
    private int index;

    public Entiers() {
        index = 0;
        entiers = new int[TAILLE];
    }

    public Entiers(int[] args) {
        index = 0;
        entiers = new int[args.length];
        for (int i : args) {
            entiers[index] = i;
            index++;
        }
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
