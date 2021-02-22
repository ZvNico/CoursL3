package zoo;

import java.util.ArrayList;

public class Utilisation {
    public static void main(String[] args) {
        Animal animal = new Animal(65, "foxy");
        Chien chien1 = new Chien(30, "snowy", "Georges Dupont");
        System.out.println(chien1.toString());
        Chien chien2 = new Chien(45, "getzy", "Dylan Garcia");
        Chien chien3 = new Chien(35, "roquette", "Chris Pratt");
        Chat chat = new Chat(20, "jacky jack", "chartreux");
        Animal[] animaux = {animal, chien1, chien2, chien3, chat};
        for (Animal value : animaux) {
            System.out.println(value.toString());
        }
    }
}
