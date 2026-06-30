import java.util.Scanner;

public class MarksheetGeneration {
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
            System.out.println("2- VIEW MARKSHEET");
            System.out.println("3- SEARCH STUDENT");
            System.out.println("4- GENERATE GRADE");
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
                    // View Marksheet
                    if (count == 0) {
                        System.out.println("No Student Records Available!");
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
                        System.out.println("No Student Records Available!");
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
                    // Generate Grade
                    System.out.print("Enter Roll Number: ");
                    roll = sc.nextInt();
                    found = false;

                    if (count == 0) {
                        System.out.println("No Student Records Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            if (rollNo[i] == roll) {
                                found = true;

                                System.out.println("Student Name : " + studentName[i]);
                                System.out.println("Marks : " + marks[i]);

                                if (marks[i] >= 90) {
                                    System.out.println("Grade : A");
                                } else if (marks[i] >= 75) {
                                    System.out.println("Grade : B");
                                } else if (marks[i] >= 60) {
                                    System.out.println("Grade : C");
                                } else if (marks[i] >= 40) {
                                    System.out.println("Grade : D");
                                } else {
                                    System.out.println("Grade : F");
                                }

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