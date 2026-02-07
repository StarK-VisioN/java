// Encapsulattion
public class Java_4 {
    public static void main(String args[]) {
        Student s = new Student();
        s.displayInfo();  // access through method only
    }
}

class Student {
    private String name = "Niraj";  // data is hidden
    private int age = 20;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



