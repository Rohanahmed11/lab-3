package Lab3;
import java.util.Scanner;

public class StudentMarkSheet {

    public static double calculatePercentage(double obtainedMarks, double totalMarks) {
        return (obtainedMarks / totalMarks) * 100;
    }

    public static char determineGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else if (percentage >= 50) return 'E';
        else return 'F';
    }

    public static double calculateGPA(char grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'E': return 0.0;
            case 'F': return 0.0;
            default: return 0.0;
        }
    }

    public static void displayMarkSheet(String studentName, double obtainedMarks, 
    double totalMarks, double percentage, char grade, double gpa) {
        System.out.println("\n--- Mark Sheet ---");
        System.out.printf("Student Name: %s\n", studentName);
        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Obtained Marks: %.2f\n", obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.printf("Grade: %c\n", grade);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter the total marks: ");
        double totalMarks = scanner.nextDouble();
        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        char grade = determineGrade(percentage);
        double gpa = calculateGPA(grade);

        displayMarkSheet(studentName, obtainedMarks, totalMarks, percentage, grade, gpa);

        scanner.close();
    }
}

