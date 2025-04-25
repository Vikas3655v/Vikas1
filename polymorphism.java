// Interface
interface AnimalActions {
    void makeSound();
    void move();
}

// Abstract Class
abstract class Animal implements AnimalActions {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void eat();

    // Concrete method
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Subclass 1
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Implementing abstract method
    void eat() {
        System.out.println(name + " eats bones.");
    }

    // Overriding interface methods
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    public void move() {
        System.out.println(name + " runs on 4 legs.");
    }
}

// Subclass 2
class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " eats seeds.");
    }

    public void makeSound() {
        System.out.println(name + " chirps.");
    }

    public void move() {
        System.out.println(name + " flies.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal bird = new Bird("Tweety");

        dog.makeSound();  // Polymorphism: method overriding
        dog.eat();
        dog.sleep();

        System.out.println("----------------");

        bird.makeSound();  // Polymorphism: method overriding
        bird.eat();
        bird.sleep();
    }
}
