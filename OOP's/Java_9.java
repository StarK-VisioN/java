// deep copy
public class Java_9 {
    public static void main(String args[]) {
        int marks[] = {90, 80, 70};
        Student s1 = new Student("Niraj", marks);
        Student s2 = new Student(s1);  // deep copy

        s2.marks[0] = 100;  // modify s2's copy only

        s1.display();
        s2.display();
    }
}

class Student {
    String name;
    int marks[];

    // Deep copy constructor
    Student(Student s) {
        this.name = s.name;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];  // copying values, not reference
        }
    }

    Student(String name, int marks[]) {
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




