// types of construtors :- 1] Non-parameterised.
//                         2] Parameterised.

public class Java_6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Niraj");
        System.out.println(s2.name);
        
        Student s3 = new Student("Niraj", 123);
        System.out.println(s3.name + ", " + s3.roll_no);
    }
}

class Student {
    String name;
    int roll_no;

    Student() {  // non-parameterized constructor
        System.out.println("Constructor running");
    }

    Student(String name) {  // parameterized constructor
        this.name = name;
    }

    Student(String name, int roll_no) {  // parameterized constructor
        this.name = name;
        this.roll_no = roll_no;
    }
}

