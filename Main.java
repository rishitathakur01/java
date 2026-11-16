class Student {
    String name;
    int rollNumber;
    int marks;

    // Constructor
    Student(String n, int r, int m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating three objects
        Student s1 = new Student("Riya", 1, 85);
        Student s2 = new Student("Aman", 2, 92);
        Student s3 = new Student("Priya", 3, 78);

        // Displaying details
        s1.display();
        s2.display();
        s3.display();

        // Finding the student with highest marks
        Student topper = s1;

        if (s2.marks > topper.marks) {
            topper = s2;
        }

        if (s3.marks > topper.marks) {
            topper = s3;
        }

        System.out.println("Student with Highest Marks:");
        topper.display();
    }
}