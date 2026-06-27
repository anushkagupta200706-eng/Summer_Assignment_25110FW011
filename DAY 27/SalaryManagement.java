import java.util.Scanner;
public class SalaryManagement {
    static Scanner sc = new Scanner(System.in);

    static void inputData(String name[], double basicSalary[], int n) {
        System.out.println("\nEnter Employee Details:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            basicSalary[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    static void calculateSalary(String name[], double basicSalary[], int n) {
        System.out.println("\n--------- Salary Details ---------");
        System.out.println("Name\tBasic\tHRA\tDA\tTotal Salary");

        for (int i = 0; i < n; i++) {
            double hra = basicSalary[i] * 0.20;
            double da = basicSalary[i] * 0.10;
            double totalSalary = basicSalary[i] + hra + da;

            System.out.println(name[i] + "\t" + basicSalary[i] + "\t" + hra + "\t" + da + "\t" + totalSalary);
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String name[] = new String[n];
        double basicSalary[] = new double[n];

        inputData(name, basicSalary, n);
        calculateSalary(name, basicSalary, n);
    }
}