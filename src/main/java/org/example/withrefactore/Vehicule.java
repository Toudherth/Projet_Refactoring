package org.example.withrefactore;

/**Defaut : avec le refactoirng on ne peux pas faire une class de généralisation
 * avec plusieurs classes de spécialisation a la fois*/

/** Opération de Refactoring Visée : "Extract Superclass"*/

public abstract class Vehicule {
    protected String marque;
    protected String modèle;
    protected int annéeFabrication;
    protected String couleur;
    protected float vitesse;

    public Vehicule(String marque, String modèle, int annéeFabrication, String couleur, float vitesse) {
        this.marque = marque;
        this.modèle = modèle;
        this.annéeFabrication = annéeFabrication;
        this.couleur = couleur;
        this.vitesse = vitesse;
    }
    public String getMarque() {return marque;}
    public void setMarque(String marque) { this.marque = marque;}
    public String getModèle() {  return modèle;}
    public void setModèle(String modèle) {this.modèle = modèle;}
    public int getAnnéeFabrication() {return annéeFabrication;}
    public void setAnnéeFabrication(int annéeFabrication) {this.annéeFabrication = annéeFabrication;}
    public String getCouleur() {return couleur;}
    public void setCouleur(String couleur) { this.couleur = couleur;}
    public float getVitesse() {return vitesse; }
    public void setVitesse(float vitesse) {this.vitesse = vitesse;}
    public abstract float accelerer(float deltaVitesse);
    public abstract float decelerer(float deltaVitesse);
}
