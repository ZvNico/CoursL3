package graphique;

public class Ligne extends ObjetGraphique {
    private int longueur;
    private double angle;

    public Ligne(final Couleur couleur, final int x, final int y, final int epaisseur,
                 final int longueur, final double angle) {
        super(couleur, x, y, epaisseur);
        this.longueur = longueur;
        this.angle = angle;
    }

    // CONSTRUCTEUR DE COPIE
    public Ligne(final Ligne obj) {
        this(obj.getCouleur(), obj.getX(), obj.getY(), obj.getEpaisseur(),
                obj.longueur, obj.angle);
    }

    public int getLongueur() {
        return longueur;
    }

    public double getAngle() {
        return angle;
    }

    public void setLongueur(final int longueur) {
        this.longueur = longueur;
    }

    public void setAngle(final int angle) {
        this.angle = angle;
    }

    @Override
    public ObjetGraphique copie() {
        Ligne copie = new Ligne(this.getCouleur(), this.getX(), this.getY(), this.getEpaisseur(), longueur, angle);
        return copie;
    }

    @Override
    public void afficher() {
        System.out.print("(");
        super.afficher();
        System.out.print(" " + longueur + " " + angle);
        System.out.println(")");
    }

    @Override
    public void effacer() {
        System.out.println("Effacer la ligne");
        super.effacer();
    }
}
