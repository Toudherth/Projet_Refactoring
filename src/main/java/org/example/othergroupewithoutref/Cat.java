package org.example.othergroupewithoutref;

// Défaut : la méthode makeSound est répétée dans les classes Dog et Cat
// Opération de Refactoring Visée : "Extract Superclass"
public class Cat {

    private String name;
    private String color;

    public void makeSound() { System.out.println("Miaou"); }

    public void chaseMouse() { System.out.println("Le chat chasse une souris."); }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
