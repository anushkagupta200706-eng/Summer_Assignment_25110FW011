import java.util.Scanner;

public class StudentRecordManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNo[] = new int[10];
        String studentName[] = new String[10];
        int marks[] = new int[10];

        int count = 0;
        int option;

        do {
            System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- ADD STUDENT");
            System.out.println("2- VIEW STUDENTS");
            System.out.println("3- SEARCH STUDENT");
            System.out.println("4- UPDATE MARKS");
            System.out.println("5- EXIT");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    // Add Student
                    if (count < 10) {
                        System.out.print("Enter Roll Number: ");
                        rollNo[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        studentName[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextInt();

                        count++;
                        System.out.println("Student Added Successfully!");
                    } else {
                        System.out.println("Record is Full!");
                    }
                    break;

                case 2:
                    // View Students
                    if (count == 0) {
                        System.out.println("No Students Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll Number : " + rollNo[i]);
                            System.out.println("Student Name : " + studentName[i]);
                            System.out.println("Marks : " + marks[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    // Search Student
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    boolean found = false;

                    if (count == 0) {
                        System.out.println("No Students Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            if (rollNo[i] == roll) {
                                System.out.println("Roll Number : " + rollNo[i]);
                                System.out.println("Student Name : " + studentName[i]);
                                System.out.println("Marks : " + marks[i]);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student Not Found!");
                        }
                    }
                    break;

                case 4:
                    // Update Marks
                    System.out.print("Enter Roll Number: ");
                    roll = sc.nextInt();
                    found = false;

                    if (count == 0) {
                        System.out.println("No Students Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            if (rollNo[i] == roll) {
                                found = true;

                                System.out.print("Enter New Marks: ");
                                int newMarks = sc.nextInt();

                                marks[i] = newMarks;

                                System.out.println("Marks Updated Successfully!");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student Not Found!");
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