import java.util.Scanner;
public class CampusCompanion {

    static Scanner sc = new Scanner(System.in);

    static String studentName = "";
    static int rollNo;
    static String branch = "";
    static int semester;

    static int totalClasses;
    static int attendedClasses;

    static int marks[] = new int[5];

    static String tasks[] = new String[5];

    public static void showMenu() {
        System.out.println("\n========== CAMPUS COMPANION ==========");
        System.out.println("1. Student Profile");
        System.out.println("2. Attendance Tracker");
        System.out.println("3. Marks Manager");
        System.out.println("4. Task Manager");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void studentProfile() {
        //input details
        sc.nextLine();
        System.out.print("Enter Student Name : ");
        studentName=sc.nextLine();
        System.out.print("Enter Student Roll no : ");
        rollNo=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Branch : ");
        branch=sc.nextLine();
        System.out.print("Enter Semester : ");
        semester=sc.nextInt();
        
        //display details
        System.out.println("\n*****STUDENT DETAILS*****");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Roll no : " + rollNo);
        System.out.println("Branch : " + branch);
        System.out.println("Semester : " + semester);
    }

    public static void attendanceTracker() {
        //input details
        System.out.print("Enter Total Classes : ");
        totalClasses=sc.nextInt();
        System.out.print("Enter Total Classes Attended : ");
        attendedClasses=sc.nextInt();
        double percentage=calculateAttendance();
        System.out.println();

        //display attendance
        System.out.println("Attendance Percentage : " + percentage + "%");
        if(percentage<75){
            System.out.println("Attendance Shortage!");
        }else{
            System.out.println("Attendance is Good!");
        }
    }

    public static void marksManager() {
        //input marks
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter Subject " + (i+1) + " Marks : ");
            marks[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        double percentage=(total * 100.0) / 500;
        char grade= calculateGrade(percentage);
        System.out.println();

        //display percentage and grade
        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
    }

    public static void taskManager() {
        sc.nextLine();
        //input Tasks
        for(int i = 0; i < tasks.length; i++){
            System.out.print("Enter Task " + (i+1) + " : ");
            tasks[i] = sc.nextLine();
        }
        //Display tasks
        System.out.println("\n***** TASK LIST *****");
        for(int i=0;i<tasks.length;i++){
            System.out.println((i+1) + ". " + tasks[i]);
        }
    }

    public static double calculateAttendance() {
        if(totalClasses==0){
            return 0;
        }
        return (attendedClasses * 100.0) / totalClasses;
            }

    public static char calculateGrade(double percentage) {
        if(percentage>=90){
            return 'A';
        }else if(percentage>=75){
            return 'B';
        }else if(percentage>=60){
            return 'C';
        }else if(percentage>=40){
            return 'D';
        }else{
            return 'F';
        }
    }

    public static void exitProgram() {
        System.out.println("Thank You!");
    }

    public static void main(String[] args) {
        int option;

        do {
            showMenu();
            option = sc.nextInt();
            System.out.println();
            switch(option){

                case 1:
                    studentProfile();
                    break;

                case 2:
                    attendanceTracker();
                    break;

                case 3:
                    marksManager();
                    break;

                case 4:
                    taskManager();
                    break;

                case 5:
                    exitProgram();
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

        }while(option!=5);

        sc.close();
    }
}
