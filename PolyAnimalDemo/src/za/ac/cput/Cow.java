package za.ac.cput;

public class Cow extends Animal {

    @Override
    String makeSound() {
        return "Moo!";
    }

    @Override
    String getName() {
        return "Cow";
    }

    @Override
    public String toString() {
        return "My " + getName() + " goes " + makeSound();
    }
}// end of class
