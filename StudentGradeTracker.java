import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("=== Student Grade Tracker ===");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input grades
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades.add(sc.nextInt());
        }

        // Calculate average
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();

        // Find highest and lowest
        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        // Display summary report
        System.out.println("\n=== Summary Report ===");
        System.out.println("Total Students: " + grades.size());
        System.out.println("Grades: " + grades);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        sc.close();
    }
}
