import java.util.Scanner;
public class MarksheetGeneration {
    static Scanner sc = new Scanner(System.in);

    static void inputData(String name[], int marks[][], int n) {

        System.out.println("\nEnter Student Details:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Student Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks of Subject 1: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Enter Marks of Subject 2: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Enter Marks of Subject 3: ");
            marks[i][2] = sc.nextInt();
            sc.nextLine();
        }
    }

    static void displayMarksheet(String name[], int marks[][], int n) {

        System.out.println("\n----------- MARKSHEET -----------");
        System.out.println("Name\tTotal\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = total / 3.0;

            char grade;

            if (percentage >= 90)
                grade = 'A';
            else if (percentage >= 75)
                grade = 'B';
            else if (percentage >= 60)
                grade = 'C';
            else if (percentage >= 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println(name[i] + "\t" + total + "\t" + percentage + "\t\t" + grade);
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String name[] = new String[n];
        int marks[][] = new int[n][3];

        inputData(name, marks, n);
        displayMarksheet(name, marks, n);
    }
}