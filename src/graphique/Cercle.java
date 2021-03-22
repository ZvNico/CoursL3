package graphique;

public class Cercle extends ObjetGraphique {
    private int rayon;

    public Cercle(final Couleur couleur, final int x, final int y, final int epaisseur,
                  final int rayon) {
        super(couleur, x, y, epaisseur);
        this.rayon = rayon;
    }

    @Override
    public ObjetGraphique copie() {
        Cercle copie = new Cercle(this.getCouleur(), this.getX(), this.getY(), this.getEpaisseur(), rayon);
        return copie;
    }

    // CONSTRUCTEUR DE COPIE
    public Cercle(final Cercle obj) {
        this(obj.getCouleur(), obj.getX(), obj.getY(), obj.getEpaisseur(), obj.rayon);
        /**
         EVITER LA DUPLICATION DE CODE (smell code)
         super(obj.getCouleur(), obj.getX(), obj.getY(), obj.getEpaisseur());
         this.rayon = obj.rayon;
         */
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(final int rayon) {
        this.rayon = rayon;
    }


    // REDEFINITION DE LA METHODE HERITEE afficher
    @Override
    public void afficher() {
        System.out.print("(");
        super.afficher();
        System.out.print(" " + rayon);
        System.out.println(")");
    }

    // REDEFINITION DE LA METHODE HERITEE effacer
    @Override
    public void effacer() {
        super.effacer();
        System.out.println("Effacer la partie cercle");
    }
}