/*
*Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes
*/
abstract class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public abstract void makeSound();

    // Common method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Subclass: Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// Subclass: Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}

// Main class to test the hierarchy
public class AnimalHierarchyTest {
    public static void main(String[] args) {
        // Polymorphic behavior
        Animal dog = new Dog("Buddy", 5);
        Animal cat = new Cat("Whiskers", 3);
        Animal bird = new Bird("Tweety", 1);

        // Display information and sounds
        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        bird.displayInfo();
        bird.makeSound();
    }
}
