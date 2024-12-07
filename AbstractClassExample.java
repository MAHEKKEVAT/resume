// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass Dog that extends Animal
class Dog extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat that extends Animal
class Cat extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test the abstract class and methods
public class AbstractClassExample {
    public static void main(String[] args) {
        // Cannot instantiate the abstract class Animal
        // Animal animal = new Animal(); // This will cause a compile-time error

        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the implemented abstract method
        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows

        // Calling the concrete method from the abstract class
        myDog.eat(); // Outputs: This animal eats food.
        myCat.eat(); // Outputs: This animal eats food.
    }
}