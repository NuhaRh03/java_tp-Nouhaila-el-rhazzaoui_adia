public class Voiture {
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemarree;
    private Moteur moteur;
    private Roue[] roues;

   public Voiture() {
        this.marque = "Marque par défaut";
        this.modele = "Modèle par défaut";
        this.vitesse = 0;
        this.moteur = new Moteur("Moteur par défaut", 0);
        this.roues = new Roue[4];
        for (int i = 0; i < 4; i++) {
            this.roues[i] = new Roue();
        }
    }

    public Voiture(String modele, String marque, double vitesse, boolean estDemarree, Moteur moteur,Roue[] roues) {
        this.modele = modele;
        this.marque = marque;
        this.vitesse = vitesse;
        this.estDemarree = estDemarree;
        this.moteur = moteur;
        this.roues = roues;}

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public boolean isEstDemarree() {
        return estDemarree;
    }

    public void setEstDemarree(boolean estDemarree) {
        this.estDemarree = estDemarree;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
     public Roue[] getRoues() {
        return roues;
    }

    public void setRoues(Roue[] roues) {
        this.roues = roues;
    }

    public int deQuellePuissance() {
        if (moteur != null) {
            return moteur.getPuissance();
        } else {
            return 0; // Ou une valeur par défaut appropriée
        }
    }

    public void demarre() {
        estDemarree = true;
        System.out.println("La voiture a démarré.");
    }

    public void accelere(double acceleration) {
        if (estDemarree) {
            vitesse += acceleration;
            System.out.println("La voiture accélère. Vitesse actuelle : " + vitesse + " km/h");
        } else {
            System.out.println("La voiture doit être démarrée pour accélérer.");
        }
    }

    public void changerLeMoteur(Moteur nouveauMoteur) {
        if (moteur == null) {
            moteur = nouveauMoteur;
            System.out.println("Le moteur a été ajouté avec succès.");
        } else {
            System.out.println("La voiture a déjà un moteur. Retirez l'ancien moteur avant d'en ajouter un nouveau.");
        }
    }
}
