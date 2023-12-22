package org.example.othergroupewithoutref;


// Défaut : la méthode makeSound est répétée dans les classes Dog et Cat
// Opération de Refactoring Visée : "Extract Superclass"
public class Dog {

    private String name;
    private String color;

    public void makeSound() { System.out.println("Wouaf"); }

    public void fetchBall() { System.out.println("Le chien rapporte la balle."); }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
