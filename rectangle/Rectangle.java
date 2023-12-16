class Rectangle {
    // Rectangle droit

    private Point hg; // Le coin haut à gauche
    private Point bd; // Le coin bas à droite

    // Constructeur par défaut
    public Rectangle() {
        // Initialiser le coin bas à droite par défaut
        this.bd = new Point(0, 0);
    }

    // Constructeur avec initialisation des coins
    public Rectangle(Point h, Point b) {
        // Initialiser les coins à partir des paramètres donnés
        this.hg = h;
        this.bd = b;
    }

    // Méthode pour obtenir le coin haut à gauche
    public Point getHautGauche() {
        return hg;
    }

    // Méthode pour afficher les coordonnées des coins
    public void afficher() {
        // Afficher les coordonnées des coins
        System.out.println("{" + this.hg + ":" + this.bd + "}");
    }

    // Méthode pour calculer la surface du rectangle
    public int surface() {
        // Calculer et retourner la surface du rectangle
        return (int) Math.abs((this.bd.getX() - this.hg.getX()) * (this.bd.getY() - this.hg.getY()));
    }

    // Méthode pour effectuer un zoom sur le rectangle
    public void zoom(int deltax, int deltay) {
        // Dilatation des coordonnées en ajoutant les deltas
        this.hg.setX(this.hg.getX() + deltax);
        this.hg.setY(this.hg.getY() + deltay);

        this.bd.setX(this.bd.getX() + deltax);
        this.bd.setY(this.bd.getY() + deltay);
    }

    // Autres méthodes...
}
