package org.example.othergroupewithref;


// Défaut : la méthode makeSound est répétée dans les classes Dog et Cat
// Opération de Refactoring Visée : "Extract Superclass"
public class Cat extends Animal {

    @Override
    public void makeSound() { System.out.println("Miaou"); }

    public void chaseMouse() { System.out.println("Le chat chasse une souris."); }

}
