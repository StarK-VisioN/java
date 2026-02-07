// Hybrid inheritance

public class Java_13 {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();

        Tuna tuna = new Tuna();
        tuna.eat();
        tuna.swim();

        Crow crow = new Crow();
        crow.eat();
        crow.fly();
        crow.caw();

        Human human = new Human();
        human.eat();
        human.walk();
        human.speak();
    }
}

// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Derived class 1
class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}

// Derived class 2
class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}

// Derived class 3
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Fish subclasses
class Tuna extends Fish {
    void tunaFeature() {
        System.out.println("Tuna is fast");
    }
}

class Shark extends Fish {
    void sharkFeature() {
        System.out.println("Shark is strong");
    }
}

// Bird subclass
class Crow extends Bird {
    void caw() {
        System.out.println("Crow caws");
    }
}

// Mammal subclasses
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Human speaks");
    }
}




