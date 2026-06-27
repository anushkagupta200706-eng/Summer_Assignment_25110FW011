import java.util.Scanner;
public class EmployeeManagement {
    static Scanner sc = new Scanner(System.in);

    static void inputData(int id[], String name[], double salary[], int n) {
        System.out.println("\nEnter Employee Details:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }
    }

    static void displayData(int id[], String name[], double salary[], int n) {
        System.out.println("\n------ Employee Records ------");
        System.out.println("ID\tName\t\tSalary");

        for (int i = 0; i < n; i++) {
            System.out.println(id[i] + "\t" + name[i] + "\t\t" + salary[i]);
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        int id[] = new int[n];
        String name[] = new String[n];
        double salary[] = new double[n];

        inputData(id, name, salary, n);
        displayData(id, name, salary, n);
    }
}
