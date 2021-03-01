package TP2.entiers2;

public class Entiers {
    public static final int TAILLE = 5;
    private Integer[] entiers;
    private int index;

    public Entiers() {
        index = 0;
        entiers = new Integer[TAILLE];
    }

    public Entiers(Integer[] args) {
        entiers = args;
        index = args.length;
        entiers[index - 1] = 666;
    }

    public void add(int x) {
        if (index < entiers.length) {
            entiers[index] = x;
            for (int i = index + 1; i < entiers.length; i++) {
                if (entiers[i] == null) {
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
        for (Integer i : entiers) {
            if (i == null) {
                tab += "null ";
            } else {
                tab += i + " ";
            }
        }
        tab += "]";
        return tab;
    }

}
