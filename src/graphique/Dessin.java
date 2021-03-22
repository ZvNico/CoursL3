package graphique;

public class Dessin {
	private ObjetGraphique [] objetGraphiques;
	private int libre; // la première place libre à laquelle ajouter

	
	public Dessin(final int n) {
		objetGraphiques = new ObjetGraphique [n];
	}

	
		// principe d'encapsulation non respecté
	// pas de copie défensive rangée dans le tableau d'objets
	public void add(final ObjetGraphique obj) {

		objetGraphiques [libre] = obj.copie();
		libre++;
	}

	// le déplacement est une translation
	public void deplacer(final int dx, final int dy){
		for (ObjetGraphique obj : objetGraphiques) {
			obj.deplacer(dx, dy);
		}
	}

	public void afficher(){
		for (ObjetGraphique obj : objetGraphiques) {
			obj.afficher();
		}
	}

	public void effacer(){
		for (ObjetGraphique obj : objetGraphiques) {
			obj.effacer();
		}
	}
}
