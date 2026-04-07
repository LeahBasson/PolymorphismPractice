
package za.ac.cput;

public class Cat extends Animal{
    @Override
    String makeSound() {
        return "Meow!";
    }
    
    @Override
    String getName() {
        return "Cat";
    }

    @Override
    public String toString() {
        return "My " + getName() + " goes " + makeSound();
    }
}// end of class
