package org.example.withrefactore;

/**Defaut :  */
/** Opération de Refactoring Visée : "Extract Superclass"*/

public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String marque, String modèle, int annéeFabrication, String couleur, float vitesse, int nombrePortes) {
        super(marque, modèle, annéeFabrication, couleur, vitesse);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {return nombrePortes;}
    public void setNombrePortes(int nombrePortes) {this.nombrePortes = nombrePortes;}
    /*** Methode declarer
     * @return*/
    @Override
    public float accelerer(float deltaVitesse) {
        this.vitesse += deltaVitesse;
        return this.vitesse;
    }
    @Override
    public float decelerer(float deltaVitesse) {
        this.vitesse = Math.max(this.vitesse - deltaVitesse, 0f);
        return vitesse;
    }
}
