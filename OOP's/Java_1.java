public class Java_1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();             // creating an object of the Pen class
        p1.setColor("Blue");            // setting color using method
        System.out.println(p1.color);   // accessing field
        p1.setTip(5);                   // setting tip size
        System.out.println(p1.tip);     // accessing field
    }
}

// class -> defines the structure (fields) and behavior (methods) of objects
// also called blueprint of object
class Pen {
    // properties (attributes or fields)
    String color;
    int tip;

    // functions (methods)
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

