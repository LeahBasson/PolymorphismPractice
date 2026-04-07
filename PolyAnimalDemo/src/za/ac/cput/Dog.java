
package za.ac.cput;

public class Dog extends Animal{
    @Override
    String makeSound() {
        return "Woof!";
    }
    
    @Override
    String getName() {
        return "Dog";
    }    
    
    @Override
    public String toString() {
        return "My " + getName() + " goes " + makeSound();
    }    
}// end of class
