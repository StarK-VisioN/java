// abstract class

public class Java_16 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

// abstract class -> those inside which we cant create objects
abstract class Animal {
    String color;
    // constructor
    Animal() {
        color = "brown";        // if in other extended classes if the changeColor function is not called then my default give them brown color.
    }
    void eat() {
        System.out.println("animal eats"); // implementation
    }

    // abstract method -> those inside which implementation is not there.
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");      // here definition for walk is 4 legs
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");      // here definition for walk is 2 legs
    }
}