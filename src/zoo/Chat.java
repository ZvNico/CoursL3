package zoo;

public class Chat extends Animal {
    private final String race;

    public Chat(int poids, final String nom, final String race) {
        super(poids, race);
        this.race = race;
    }

    public String getRace() {
        return new String(race);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "poids=" + getPoids() +
                "nom='" + getNom() + '\'' +
                "race='" + race + '\'' +
                '}';
    }
}
