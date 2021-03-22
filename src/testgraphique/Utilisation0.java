package testgraphique;

import graphique.Cercle;
import graphique.Couleur;
import graphique.ObjetGraphique;

public class Utilisation0 {
     public static void main(String [] args) {
         // classe abstraite ObjetGraphique non instanciable
    	 // NE COMPILE PAS
         // ObjetGraphique o = new  ObjetGraphique(Couleur.ROUGE, 30, 100, 12);
         
         Cercle c1 = new Cercle(Couleur.BLEU, 50, 80, 20, 25);
         Cercle c2 = new Cercle(Couleur.JAUNE, 5, 8, 2, 20);
                
         c1.afficher();
         c2.afficher();
         
         c1.effacer();
         c2.effacer();
         
         // c3 copie de c2
         Cercle c3 = new Cercle(c2);
         c3.afficher();
         
         // c2 est modifié
         c2.setRayon(80);
         c2.setCouleur(Couleur.ROUGE);
         c2.afficher();
         
         // c3 la copie de c2 n'est pas modifiée
         c3.afficher();
         
         // déplacement
         c1.deplacer(200, 300);
         c1.afficher();
         
         
         // dans un tableau d'objets graphiques, on peut ranger des lignes et des cercles
         ObjetGraphique [] objetGraphiques1 = { c1, c2};
         
         // ILLUSTRATION DU POLYMORPHISME
         // à chaque tour de boucle, la méthode afficher est liée au type de l'objet
         // tour 1 : méthode afficher de la classe Cercle
         // tour 2 : méthode afficher de la classe Cercle
         // par la suite on aura aussi des lignes....
         System.out.println("PREMIER TABLEAU");
         for (int i = 0; i <  objetGraphiques1.length; i++) {
             objetGraphiques1[i].afficher();
         }
         
         // OU ENCORE
         // instanciation d'un tableau de longueur 2
         ObjetGraphique [] objetGraphiques2 = new ObjetGraphique [2];
         // ranger les 2 cercles dans le tableau
         //  par la suite on rangera aussi des lignes....
         objetGraphiques2[0] = c1;
         objetGraphiques2[1] = c2;
         
         System.out.println("DEUXIEME TABLEAU");
         for (ObjetGraphique obj : objetGraphiques2) {
        	 obj.afficher();
         }
    }
 }
