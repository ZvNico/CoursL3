package testgraphique;

import graphique.Cercle;
import graphique.Couleur;
import graphique.Ligne;
import graphique.ObjetGraphique;
import graphique.Dessin;


public class Utilisation {
     public static void main(String [] args) {         
         Ligne l = new Ligne(Couleur.ROUGE, 30, 100, 12, 200, 30.4);
         Cercle c1 = new Cercle(Couleur.BLEU, 50, 80, 20, 25);
         Cercle c2 = new Cercle(Couleur.JAUNE, 5, 8, 2, 20);
         
         l.afficher();
         c1.afficher();
         c2.afficher();
         
         l.effacer();
         c1.effacer();
         c2.effacer();
         
         Cercle c3 = new Cercle(c2);
         c3.afficher();
         c2.setRayon(80);
         c2.setCouleur(Couleur.ROUGE);
         c2.afficher();
         c3.afficher();
         
         c1.deplacer(200, 300);
         c1.afficher();
           
         System.out.println("DESSIN");
         Dessin dessin = new Dessin(3);
         dessin.add(l);
         dessin.add(c1);
         dessin.add(c2);
         
         dessin.afficher();
         dessin.effacer();
         dessin.deplacer(100, 200);
         dessin.afficher();
         
         
         // VERIFICATION DE L'ABSENCE DE COPIE DEFENSIVE de la méthode add de Dessin
         System.out.println("Le cercle c1 est modifié");
         c1.afficher();
         c1.setX(666);
         c1.setY(666);
         c1.setRayon(666);
         c1.afficher();
         
         System.out.println("DESSIN MODIFIE après modification du cercle");
         System.out.println("il y a 2 références désignant le même cercle : ");
         System.out.println("la référence c1 et une référence du tableau d'objets graphiques du tableau du Dessin");
         dessin.afficher();
    }
 }
