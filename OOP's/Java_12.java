// Hierarchial Inheritance

public class Java_12 {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();        // from Animal
        dobby.bark();       // from Dog

        // Cat object
        Cat kitty = new Cat();
        kitty.eat();        // from Animal
        kitty.meow();       // from Cat
    }
}

class Animal {
    void eat() {
        System.out.println("Eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
