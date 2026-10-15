class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name);
    }

    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        dog.sound();
    }
}
