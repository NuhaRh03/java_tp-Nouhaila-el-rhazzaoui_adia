public class Roue {

    private int largeur;
    private int diametreJante;

    // Constructeur par défaut
    public Roue() {
        this.largeur = 0;
        this.diametreJante = 0;
    }

    // Constructeur avec la largeur et le diamètre de la jante
    public Roue(int largeur, int diametreJante) {
        this.largeur = largeur;
        this.diametreJante = diametreJante;
    }

    public int getLargeur() {
        return largeur;
    }

    // Setter pour la largeur
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    // Getter pour le diamètre de la jante
    public int getDiametreJante() {
        return diametreJante;
    }

    // Setter pour le diamètre de la jante
    public void setDiametreJante(int diametreJante) {
        this.diametreJante = diametreJante;
    }
}

// ...
