package org.example.withoutrefactore;

// Défaut: Redondance du code dans la classe Voiture. Si on crée d'autres classes (comme Moto) avec des attributs et opérations similaires,
// on aura une duplication de code.

// Opération de Refactoring Visée : "Extract Superclass"*/


public class Voiture {

    private String marque;
    private String modèle;
    private int annéeFabrication;
    private String couleur;
    private float vitesse;
    private int nombrePortes;

    public Voiture(String marque, String modèle, int annéeFabrication, String couleur, float vitesse, int nombrePortes) {
        this.marque = marque;
        this.modèle = modèle;
        this.annéeFabrication = annéeFabrication;
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.nombrePortes = nombrePortes;
    }
    public String getMarque() {return marque;}
    public void setMarque(String marque) {this.marque = marque; }
    public String getModèle() { return modèle;}
    public void setModèle(String modèle) {this.modèle = modèle;}
    public int getAnnéeFabrication() { return annéeFabrication;}
    public void setAnnéeFabrication(int annéeFabrication) { this.annéeFabrication = annéeFabrication;}
    public String getCouleur() {return couleur;}
    public void setCouleur(String couleur) { this.couleur = couleur;}
    public float getVitesse() {return vitesse;}
    public int getNombrePortes() {return nombrePortes;}
    public void setNombrePortes(int nombrePortes) {this.nombrePortes = nombrePortes;}
    public void setVitesse(float vitesse) { this.vitesse = vitesse;}
    /*** Methode declarer */
    public float accelerer(float deltaVitesse) {this.vitesse += deltaVitesse; return vitesse;}
    public float decelerer(float deltaVitesse) {this.vitesse = Math.max(this.vitesse - deltaVitesse, 0f); return vitesse;}


}
