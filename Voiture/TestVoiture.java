public class TestVoiture {

    public static void main(String[] args) {

        // Créer une voiture par défaut
        Voiture voiture = new Voiture();

        // Afficher les propriétés de la voiture
        System.out.println("Marque : " + voiture.getMarque());
        System.out.println("Modèle : " + voiture.getModele());
        System.out.println("Vitesse : " + voiture.getVitesse());
        System.out.println("Moteur : " + voiture.getMoteur().getNom());
        System.out.println("Puissance moteur : " + voiture.deQuellePuissance());

        // Modifier les propriétés de la voiture
        voiture.setMarque("Peugeot");
        voiture.setModele("208");
        voiture.setVitesse(100);
        voiture.getMoteur().setNom("PureTech 1.2");
        voiture.getMoteur().setPuissance(100);

        // Afficher les propriétés de la voiture modifiée
        System.out.println("Marque : " + voiture.getMarque());
        System.out.println("Modèle : " + voiture.getModele());
        System.out.println("Vitesse : " + voiture.getVitesse());
        System.out.println("Moteur : " + voiture.getMoteur().getNom());
        System.out.println("Puissance moteur : " + voiture.deQuellePuissance());

        // Changer une roue
        Roue roue = new Roue(20, 40);

        // Afficher les propriétés de la voiture modifiée
        System.out.println("Marque : " + voiture.getMarque());
        System.out.println("Modèle : " + voiture.getModele());
        System.out.println("Vitesse : " + voiture.getVitesse());
        System.out.println("Moteur : " + voiture.getMoteur().getNom());
        System.out.println("Puissance moteur : " + voiture.deQuellePuissance());
    }
}