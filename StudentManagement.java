import java.util.*;

class Student {
    String name;
    int id;

    // Constructor to initialize student details
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume newline character

        // Taking user input for multiple students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline character

            // Creating and adding student object to list
            students.add(new Student(name, id));
        }

        // Displaying all student details
        System.out.println("\n===== Student Details =====");
        for (Student s : students) {
            s.display();
            System.out.println("---------------------");
        }

        sc.close();
    }
}
