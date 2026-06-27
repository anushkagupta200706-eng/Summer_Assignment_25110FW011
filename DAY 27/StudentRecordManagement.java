import java.util.Scanner;
public class StudentRecordManagement {
    static Scanner sc = new Scanner(System.in);

    static void inputData(int roll[], String name[], int marks[], int n) {
        System.out.println("\nEnter Student Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Roll Number: ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
    }

    static void displayData(int roll[], String name[], int marks[], int n) {
        System.out.println("\n----- Student Records -----");
        System.out.println("Roll No\tName\t\tMarks");

        for (int i = 0; i < n; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        int roll[] = new int[n];
        String name[] = new String[n];
        int marks[] = new int[n];

        inputData(roll, name, marks, n);
        displayData(roll, name, marks, n);
    }
}