/* Problem Statement :
Write a Java program that demonstrates method overriding by creating a superclass
called Animal and two subclasses called Dog and Cat. 
● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound." 
● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively. 
● The program should allow the user to create and display objects of each class. 
[Hint:Use multilevel inheritance]
*/
package Java_Labs;

import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalOverriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Display sounds
        System.out.println("Generic Animal Sound:");
        genericAnimal.makeSound();

        System.out.println("\nDog Sound:");
        dog.makeSound();

        System.out.println("\nCat Sound:");
        cat.makeSound();

        scanner.close();
    }
}
