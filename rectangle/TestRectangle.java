
/* TestRectangle.java */
import java.util.*;

public class TestRectangle {

  public static void main(String[] args) {
    // Création d'un rectangle avec les coins en (1,7) et (3,87)
    Rectangle r = new Rectangle(new Point(1, 2), new Point(8, 2));

    // Affichage des coordonnées des coins avant toute modification
    r.afficher();

    // Calcul de la surface du rectangle
    int surface = r.surface();
    System.out.println("La surface du rectangle est de " + surface);

    // Dilatation du rectangle avec un facteur de 2 en largeur et 3 en hauteur
    r.zoom(2, 3);

    // Affichage des coordonnées des coins après dilatation
    r.afficher();
  }
  /*
   * La sortie du programme est :
   * Coin haut à gauche : Le point est en (1.0, 2.0)
   * Coin bas à droite : Le point est en (3.0, 4.0)
   * La surface du rectangle est de 4
   * Coin haut à gauche : Le point est en (3.0, 5.0)
   * Coin bas à droite : Le point est en (5.0, 7.0)
   */
}
