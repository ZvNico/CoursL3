package zoo;

public class Chien extends Animal {
    private String maitre;

    public Chien(int poids, final String nom, String maitre) {
        super(poids, nom);
        this.maitre = maitre;
    }

    public String getMaitre() {
        return new String(maitre);
    }

    public void setMaitre(String maitre) {
        this.maitre = maitre;
    }

    @Override
    public String toString() {
        return "Chien{" +
                "poids=" + getPoids() +
                "nom='" + getNom() + '\'' +
                "maitre='" + maitre + '\'' +
                '}';
    }
}
