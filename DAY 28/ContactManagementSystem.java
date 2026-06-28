import java.util.Scanner;
public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int contactID[] = new int[10];
        String contactName[] = new String[10];
        String phoneNumber[] = new String[10];

        int count = 0;int option;

        do{
            System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- ADD CONTACT");
            System.out.println("2- VIEW CONTACTS");
            System.out.println("3- SEARCH CONTACT");
            System.out.println("4- UPDATE PHONE NUMBER");
            System.out.println("5- EXIT");
            option=sc.nextInt();

            switch (option) {
                case 1:
                    //add contact
                    if(count<10){
                        System.out.print("Enter Contact ID: ");
                        contactID[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Contact Name: ");
                        contactName[count]=sc.nextLine();
                        System.out.print("Enter Phone Number: ");
                        phoneNumber[count]=sc.nextLine();
                        count++;
                        System.out.println("Contact Added Successfully!");
                    }else{
                        System.out.println("Contact List is full!");
                    }
                    break;
                case 2:
                    //view contacts
                    if(count==0){
                        System.out.println("No Contacts Available!");
                    }else{
                        for(int i=0;i<count;i++){
                            System.out.println("Contact ID : " + contactID[i]);
                            System.out.println("Contact Name : " + contactName[i]);
                            System.out.println("Phone Number : " + phoneNumber[i]);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    //search contact
                    System.out.print("Enter Contact ID : ");
                    int ID=sc.nextInt();
                    boolean found=false;
                    if(count==0){
                        System.out.println("No Contacts available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(contactID[i]==ID){
                                System.out.println("Contact ID : " + contactID[i]);
                                System.out.println("Contact Name : " + contactName[i]);
                                System.out.println("Phone Number : " + phoneNumber[i]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Contact not found!");
                        }
                    }
                    break;
                case 4:
                    //update phone number
                    System.out.print("Enter Contact ID : ");
                    ID=sc.nextInt();
                    found=false;
                    if(count==0){
                        System.out.println("No Contacts available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(contactID[i]==ID){
                                found=true;
                                sc.nextLine();
                                System.out.print("Enter New Phone Number: ");
                                String newNum=sc.nextLine();
                                phoneNumber[i]=newNum;
                                System.out.println("Phone Number Updated Successfully!");
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Contact not found!");
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
        }while(option!=5);

        sc.close();
    }
}
