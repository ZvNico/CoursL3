package zoo;

public class Animal {
    private int poids;
    private final String nom;

    public Animal(final int poids, String nom){
        this.poids = poids;
        this.nom = nom;
    }

    public Animal(){
        this.poids = 0;
        this.nom = "";
    }

    public int getPoids(){
        return poids;
    }

    public String getNom(){
        return new String(nom);
    }

    public void setPoids(int poids){
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "poids=" + poids +
                ", nom='" + nom + '\'' +
                '}';
    }
}
