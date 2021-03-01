package TP2.entiers2;

public class TestEntiers {
    // l’affichage doit être de la forme [ 1 2 3 0 0 ] par exemple
    public static void afficher(Integer[] tab) {
        System.out.print("[");
        for (Integer i : tab) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] arg) {
        Entiers entiers1 = new Entiers();
        entiers1.add(1);
        entiers1.add(2);
        entiers1.add(3);
        System.out.println("TP2.entiers1 : " + entiers1);
        Integer tab[] = new Integer[Entiers.TAILLE];
        tab[0] = 20;
        tab[1] = 30;
        tab[2] = 40;
        System.out.print("tableau :  ");
        afficher(tab);
        Entiers entiers2 = new Entiers(tab);
        System.out.println("entiers2 : " + entiers2);
        System.out.println("Modification de l'élément " + tab[1] + " d'index 1 du tableau");
        tab[1] = -1;
        System.out.print("tableau :  ");
        afficher(tab);
        System.out.println("entiers2 : " + entiers2);
    }
}
