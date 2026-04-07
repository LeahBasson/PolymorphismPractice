package za.ac.cput;

public class PolyAnimalDemo {

    public static void main(String[] args) {
        Animal myAnimal = new Cat();  // Assign a subclass reference to a parent class variable
        System.out.println(myAnimal.getName() + " goes " + myAnimal.makeSound());

        myAnimal = new Dog();  // Assign a subclass reference to a parent class variable
        System.out.println(myAnimal.getName() + " goes " + myAnimal.makeSound());

        myAnimal = new Cow();  // Assign a subclass reference to a parent class variable
        System.out.println(myAnimal.getName() + " goes " + myAnimal.makeSound());

        System.out.println("\n--------------------------------------------\n");

        Animal[] animals = new Animal[3];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cow();

        for (Animal animalObj : animals) {
            System.out.println(animalObj.toString() + "\n");
        }//end for

    }// end of main

}// end of class
