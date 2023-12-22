package org.example.withoutrefactore;



public class MainWithoutRefactoring {


    public static void main(String [] args){
        Voiture maVoiture = new Voiture("Toyota", "Camry", 2022, "Bleu", 120.5f, 4);

        float nouvelleVitesse = maVoiture.accelerer(20.0f);
        float vitesseDeccelerer = maVoiture.decelerer(20.0f);
        // Utilisation de l'instance
        System.out.println("Voiture : " + maVoiture.getMarque() + " " + maVoiture.getModèle());
        System.out.println("Nombre de portes : " + maVoiture.getNombrePortes());
        System.out.println("Année de fabrication : " + maVoiture.getAnnéeFabrication());
        System.out.println("Vitesse : " + maVoiture.getVitesse());
        System.out.println("Vitesse après accélération : " + nouvelleVitesse);
        System.out.println("Vitesse après deccélération : " + vitesseDeccelerer);



    }

}
