// type of constructor :- 3] Copy constructor

public class Java_7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "niraj";
        s1.roll_no = 123;
        s1.password = "abc";

        // Creating copy using copy constructor
        Student s2 = new Student(s1);
        s2.password = "xyz"; // changing password only

        // Displaying copied values
        System.out.println("Original: " + s1.name + ", " + s1.roll_no + ", " + s1.password);
        System.out.println("Copy: " + s2.name + ", " + s2.roll_no + ", " + s2.password);
    }
}

class Student {
    String name;
    int roll_no;
    String password;

    // Default constructor
    Student() {}

    // Parameterized constructor
    Student(String name, int roll_no, String password) {
        this.name = name;
        this.roll_no = roll_no;
        this.password = password;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.roll_no = s.roll_no;
        this.password = s.password;
    }
}


