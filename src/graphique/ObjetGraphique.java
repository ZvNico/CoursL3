package graphique;


// classe abstraite donc non instanciable
abstract public class ObjetGraphique {
    private Couleur couleur;
    private int x;
    private int y;
    private int epaisseur;

    // CONSTRUCTEUR avec 4 paramètres
    protected ObjetGraphique(final Couleur couleur, final int x, final int y, final int epaisseur) {
        this.couleur = couleur;
        this.x = x;
        this.y = y;
        this.epaisseur = epaisseur;
    }

    public abstract ObjetGraphique copie();

    // CONSTRUCTEUR DE COPIE
    protected ObjetGraphique(final ObjetGraphique obj) {
        this(obj.couleur, obj.x, obj.y, obj.epaisseur);

        /*
 EVITER LA DUPLICATION DE CODE (smell code)
 this.couleur =  obj.couleur;
 this.x = obj.x;
 this.y = obj.y;
 this.epaisseur = obj.epaisseur;
 */
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setCouleur(final Couleur couleur) {
        this.couleur = couleur;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public void setEpaisseur(final int epaisseur) {
        this.epaisseur = epaisseur;
    }


    // le déplacement est une translation
    // A NE PAS REDEFINIR DANS LES SOUS-CLASSES
    public void deplacer(final int dx, final int dy) {
        x = x + dx;
        y += dy;
    }

    public void afficher() {
        System.out.print("(" + couleur + " " + x + " " + y + " " + epaisseur + ")");
    }

    public void effacer() {
        System.out.println("Effacer la partie objet graphique");
    }
}

