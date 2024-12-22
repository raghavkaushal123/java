import java.util.Scanner;

class Subject {
    int grade;
    int credits;
}

class PrintInfo {
    static void print() {
        System.out.println("Name: Raghav kaushal");
        System.out.println("USN: 1BM23CS257");
    }
}

class Student {
    String usn;
    String name;
    double SGPA;
    Subject[] subjects;

    Student() {
        subjects = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subjects[i] = new Subject();
        }
    }

    void getDetails(Scanner sc) {
        System.out.println("Enter USN:");
        usn = sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
    }

    void getMarks(Scanner sc) {
        double totalScore = 0;
        int totalCredits = 0;

        System.out.println("Enter marks and credits for 8 subjects:");
        for (int j = 0; j < 8; j++) {
            System.out.print("Enter marks for subject " + (j + 1) + ": ");
            int marks = sc.nextInt();
            System.out.print("Enter credits for subject " + (j + 1) + ": ");
            int credits = sc.nextInt();

            int grade = (marks / 10) + 1;
            if (grade > 10) grade = 10;

            subjects[j].credits = credits;
            subjects[j].grade = grade;

            totalScore += grade * credits;
            totalCredits += credits;
        }

        SGPA = totalScore / totalCredits;
    }

    void displaySGPA() {
        System.out.println("SGPA of student " + name + " (" + usn + "): " + SGPA);
    }
}

public class StudentMains {
    public static void main(String[] args) {
        PrintInfo.print();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering details for student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getDetails(sc);
            students[i].getMarks(sc);
        }

        System.out.println("\nSGPA of all students:");
        for (int i = 0; i < numStudents; i++) {
            students[i].displaySGPA();
        }

        sc.close();
    }
}
