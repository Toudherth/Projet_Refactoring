package org.example.othergroupewithref;


/** le defaut avec les methodes de refactoring pour superClass est que si on a plusieurs qui héritent de la meme classe
 * alors ce n'est pas possible de créer une meme super class donc dans ce cas la classe Animal est réalisé a partir de
 * la classe Cat mais pour l'associer a la classe Dog on a fait ça manuellement
*/

// Opération de Refactoring Visée : "Extract Superclass"
public abstract class Animal {
    private String name;
    private String color;
    public abstract void makeSound();
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
}
