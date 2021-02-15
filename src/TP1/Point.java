package TP1;

/*
 Méthodes de classe (Math)
int ceil(double a);
double sqrt(double a);

int x = Math.ceil(12.7882); //  x vaut 12
double y = Math.sqrt(2); // y vaut 1,414.....
*/

/*
		Point p = new Point(); // (0 0)
		Point q = new Point(0, 0); // (0 0)


		Point a = new Point(1, 2);
		Point b = new Point(10, 20);
*/

// les coordonnées sont constantes (mot-clé final)
// un point est invariant comme en géométrie élémentaire
// si on lui applique une translation (dx, dy)
// alors on a un nouveau point (x + dx, y + dy)


// rappel de cours
// une variable de classe (partagée par toutes les instances)
// static final double TVA = 0.20;


public class Point {
    private final int x;
    private final int y;

    // constructeur par défaut
    public Point() {
        // appel au contructeur à 2 paramètres
        // <==> Point(0,0)
        // évite la duplication de code
        this(0, 0);

        // ou encore
        // this.x = 0;
        // this.y = 0;
    }

    // les constantes sont initialsées dans le constructeur
    // 1 et 1 seule fois
    // constructeur à 2 paramètres
    public Point(final int x, final int y) {
        // x = 666; NE COMPILE PAS car final
        this.x = x;
        this.y = y;
    }

    // on construit un point copie de celui passé en paramètre
    // constructeur de copie
    public Point(final Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // pas d'accesseurs en écriture, les coordonnées sont constantes
	/*
	public void setX(final int x) {
		this.x = x;
	}
	*/

    // distance euclidienne de 2 points
    // 2 points p et q :
    // double d = p.distance(q);
    // OU double d = q.distance(p);
    public double distance(final Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    public void print() {
        System.out.print("(" + x + " " + y + ")");
    }

    public String toString() {
        return "(" + x + " " + y + ")";
    }
}
