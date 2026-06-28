import java.util.Scanner;
public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ticketID[] = new int[10];
        String customerName[] = new String[10];
        boolean booked[] = new boolean[10];
        int count = 0;int option;

        do{
            System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- BOOK TICKET");
            System.out.println("2- VIEW TICKET");
            System.out.println("3- SEARCH TICKET");
            System.out.println("4- CANCEL TICKET");
            System.out.println("5- EXIT");
            option=sc.nextInt();

            switch (option) {
                case 1:
                    //book ticket
                    if(count<10){
                        System.out.print("Enter Ticket ID: ");
                        ticketID[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Customer Name: ");
                        customerName[count]=sc.nextLine();
                        booked[count]=true;
                        count++;
                        System.out.println("Tickets Booked Successfully!");
                    }else{
                        System.out.println("No Tickets Available!");
                    }
                    break;
                case 2: 
                    //view ticket
                    if(count==0){
                        System.out.println("No Tickets Booked!");
                    }else{
                        for(int i=0;i<count;i++){
                            System.out.println("Ticket ID : " + ticketID[i]);
                            System.out.println("Customer Name : " + customerName[i]);
                            if(booked[i]){
                                System.out.println("Status : Booked");
                            }else{
                                System.out.println("Status : Cancelled");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    //search ticket
                    System.out.print("Enter Ticket ID : ");
                    int ID=sc.nextInt();
                    boolean found=false;
                    if(count==0){
                        System.out.println("No Tickets Booked!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(ticketID[i]==ID){
                                System.out.println("Ticket ID : " + ticketID[i]);
                                System.out.println("Customer Name : " + customerName[i]);
                                if(booked[i]){
                                    System.out.println("Status : Booked");
                                }else{
                                    System.out.println("Status : Cancelled");
                                }
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("No Tickets available!");
                        }
                    }
                    break;
                case 4:
                    //cancel ticket
                    System.out.print("Enter ticket ID: ");
                    ID=sc.nextInt();
                    found=false;
                    if(count==0){
                        System.out.println("No Tickets Booked!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(ticketID[i]==ID){
                                if(booked[i]){
                                    booked[i]=false;
                                    System.out.println("Ticket Cancelled Successfully!");
                                }else{
                                    System.out.println("Ticked Already Cancelled!");
                                }
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("No Tickets Available!");
                        }
                    }    
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;             
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }while(option!=5);

        sc.close();
    }
}
