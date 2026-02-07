// Shallow copy 

public class Java_8 {
    public static void main(String args[]) {
        int[] marks = {90, 80, 70};
        Student s1 = new Student("Niraj", marks);
        Student s2 = new Student(s1);  // shallow copy

        s2.marks[0] = 100;  // modify original array

        s1.display();
        s2.display();
    }
}

class Student {
    String name;
    int[] marks;

    // Shallow copy constructor
    Student(Student s) {
        this.name = s.name;
        this.marks = s.marks;  // just copying the reference
    }

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

