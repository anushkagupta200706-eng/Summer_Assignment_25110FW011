import java.util.Scanner;
public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int bookID[]=new int[10];
        String bookName[]=new String[10];
        boolean issued[]=new boolean[10];

        int count=0;int option;

        do{
            System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- ADD BOOK");
            System.out.println("2- VIEW BOOK");
            System.out.println("3- SEARCH BOOK");
            System.out.println("4- ISSUE BOOK");
            System.out.println("5- RETURN BOOK");
            System.out.println("6- EXIT");
            option=sc.nextInt();
            
            switch (option) {
            case 1:
                //add menu
                if(count<10){
                    System.out.print("Enter Book ID: ");
                    bookID[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    bookName[count]=sc.nextLine();
                    issued[count]=false;
                    count++;
                    System.out.println("Book Added Successfully!");
                }else{
                    System.out.println("Library is full!");
                }
                break;
            case 2:
                //view menu
                if(count==0){
                    System.out.println("No Books Available!");
                }else{
                    for(int i=0;i<count;i++){
                        System.out.println("Book ID : " + bookID[i]);
                        System.out.println("Book Name : " + bookName[i]);
                        if(issued[i]){
                            System.out.println("Status : Issued");
                        }else{
                            System.out.println("Status : Available");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                //search menu
                sc.nextLine();
                System.out.print("Enter Book Name : ");
                String name=sc.nextLine();
                boolean found=false;
                if(count==0){
                    System.out.println("No Books Available!");
                }else{
                    for(int i=0;i<count;i++){
                        if(bookName[i].equalsIgnoreCase(name)){
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Book ID : " + bookID[i]);
                            if(issued[i]){
                                System.out.println("Status : Issued");
                            }else{
                                System.out.println("Status : Available");
                            }
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Book Not Available!");
                    }
                }
                break;
            case 4:
                //issue menu
                sc.nextLine();
                System.out.print("Enter Book Name : ");
                name=sc.nextLine();
                found=false;
                if(count==0){
                    System.out.println("No Books Available!");
                }else{
                    for(int i=0;i<count;i++){
                        if(bookName[i].equalsIgnoreCase(name)){
                            if(issued[i]){
                                System.out.println("Book Already Issued!");
                            }else{
                                issued[i]=true;
                                System.out.println("Book Successfully Issued!");
                            }
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                    System.out.println("Book Not Available!");
                    }
                }
                break;
            case 5:
                //return menu
                sc.nextLine();
                System.out.print("Enter Book Name : ");
                name=sc.nextLine();
                found=false;
                if(count==0){
                    System.out.println("No Books Available!");
                }else{
                    for(int i=0;i<count;i++){
                        if(bookName[i].equalsIgnoreCase(name)){
                            if(issued[i]){
                                issued[i]=false;
                                System.out.println("Status : Returned");
                            }else{
                                System.out.println("Book is Already Available!");
                            }
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                    System.out.println("Book Not Available!");
                    }
                }
                break;            
            case 6:
                System.out.println("THANK YOU!");
                break;
            default:
                System.out.println("INVALID OPTION");
                break;
        }
        }while(option!=6);
        
        sc.close();
    }
}
