import java.util.Scanner;
public class MiniEmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeID[] = new int[10];
        String employeeName[] = new String[10];
        int salary[] = new int[10];

        int count = 0;
        int option;

        do {
            System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- ADD EMPLOYEE");
            System.out.println("2- VIEW EMPLOYEES");
            System.out.println("3- SEARCH EMPLOYEE");
            System.out.println("4- UPDATE SALARY");
            System.out.println("5- EXIT");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    // Add Employee
                    if (count < 10) {
                        System.out.print("Enter Employee ID: ");
                        employeeID[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        employeeName[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextInt();

                        count++;
                        System.out.println("Employee Added Successfully!");
                    } else {
                        System.out.println("Employee Record is Full!");
                    }
                    break;

                case 2:
                    // View Employees
                    if (count == 0) {
                        System.out.println("No Employees Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Employee ID : " + employeeID[i]);
                            System.out.println("Employee Name : " + employeeName[i]);
                            System.out.println("Salary : " + salary[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    // Search Employee
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    if (count == 0) {
                        System.out.println("No Employees Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            if (employeeID[i] == id) {
                                System.out.println("Employee ID : " + employeeID[i]);
                                System.out.println("Employee Name : " + employeeName[i]);
                                System.out.println("Salary : " + salary[i]);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee Not Found!");
                        }
                    }
                    break;

                case 4:
                    // Update Salary
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    found = false;

                    if (count == 0) {
                        System.out.println("No Employees Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            if (employeeID[i] == id) {
                                found = true;

                                System.out.print("Enter New Salary: ");
                                int newSalary = sc.nextInt();

                                salary[i] = newSalary;

                                System.out.println("Salary Updated Successfully!");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee Not Found!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Option!");
                    break;
            }

        } while (option != 5);

        sc.close();
    }
}
