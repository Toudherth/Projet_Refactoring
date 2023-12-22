package org.example.othergroupewithref;


// Défaut : la méthode makeSound est répétée dans les classes Dog et Cat
// Opération de Refactoring Visée : "Extract Superclass"
public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Wouaf");
    }
    public void fetchBall() { System.out.println("Le chien rapporte la balle."); }

}
