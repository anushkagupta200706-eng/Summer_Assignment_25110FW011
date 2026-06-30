import java.util.Scanner;
public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rollno[]=new int[10];
        String studentName[]=new String[10];
        int marks[]=new int[10];
        int option;int count=0;

        do{
            System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- ADD STUDENT");
            System.out.println("2- VIEW STUDENTS");
            System.out.println("3- SEARCH STUDENT");
            System.out.println("4- UPDATE MARKS");
            System.out.println("5- EXIT");
            option=sc.nextInt();
            
            switch(option){
                case 1:
                    //add student
                    if(count < 10){
                        System.out.print("Enter Roll Number: ");
                        rollno[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        studentName[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextInt();

                        count++;
                        System.out.println("Student Added Successfully!");
                    }else{
                        System.out.println("Record is Full!");
                    }
                    break;
                case 2:
                    //view students
                    if(count==0){
                        System.out.println("No Students available!");
                    }else{
                        for(int i=0;i<count;i++){
                            System.out.println("Roll No : " + rollno[i]);
                            System.out.println("Student Name : " + studentName[i]);
                            System.out.println("Marks : " + marks[i]);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    //search students
                    System.out.println("Enter student roll no : ");
                    int roll=sc.nextInt();
                    boolean found=false;
                    if(count==0){
                        System.out.println("No Students available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(rollno[i]==roll){
                                System.out.println("Roll No : " + rollno[i]);
                                System.out.println("Student Name : " + studentName[i]);
                                System.out.println("Marks : " + marks[i]);
                                found=true;
                                break;
                            }    
                        }
                        if(!found){
                            System.out.println("Student not Available!");
                        }
                    }
                    break;
                case 4:
                    //update students
                    System.out.println("Enter student roll no : ");
                    roll=sc.nextInt();
                    found=false;
                    if(count==0){
                        System.out.println("No Students available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(rollno[i]==roll){
                                found=true;
                                System.out.print("Enter New Marks: ");
                                int newMarks=sc.nextInt();
                                marks[i]=newMarks;
                                System.out.println("Marks Updated Successfully!");
                                break;
                            }    
                        }
                        if(!found){
                            System.out.println("Student not Available!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(option!=5);

        sc.close();
    }
}
