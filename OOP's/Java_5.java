// construtor

public class Java_5 {
    public static void main(String[] args) {
        Student s1 = new Student("Niraj");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll_no;

    Student(String name) {
        this.name = name;
    }
}