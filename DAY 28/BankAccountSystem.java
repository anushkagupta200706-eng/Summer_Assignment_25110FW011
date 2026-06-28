import java.util.Scanner;
public class BankAccountSystem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int accountNumber[]=new int[10];
        String accountHolder[]= new String[10];
        int balance[]=new int[10];

        int count=0;int option;

        do{
           System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- CREATE ACCOUNT");
            System.out.println("2- VIEW ACCOUNT");
            System.out.println("3- SEARCH ACCOUNT");
            System.out.println("4- DEPOSIT MONEY");
            System.out.println("5- WITHDRAW MONEY");
            System.out.println("6- EXIT");
            option=sc.nextInt();

            switch (option) {
                case 1:
                    //create account
                    if(count<10){
                        System.out.print("Enter account number: ");
                        accountNumber[count]=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Account Holder Name: ");
                        accountHolder[count]=sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        balance[count]=sc.nextInt();
                        count++;
                        System.out.println("Account Created Successfully!");
                    }else{
                        System.out.println("Bank is Full!");
                    }
                    break;
                case 2:
                    //view account
                    if(count==0){
                        System.out.println("No Account Available!");
                    }else{
                        for(int i=0;i<count;i++){
                            System.out.println("Account number : " + accountNumber[i]);
                            System.out.println("Account Holder Name : " + accountHolder[i]);
                            System.out.println("Current Balance : " + balance[i]);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    //search account
                    System.out.print("Enter Account Number : ");
                    int num=sc.nextInt();
                    boolean found=false;
                    if(count==0){
                        System.out.println("No account available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(accountNumber[i]==num){
                                System.out.println("Account number : " + accountNumber[i]);
                                System.out.println("Account Holder Name : " + accountHolder[i]);
                                System.out.println("Current Balance : " + balance[i]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Account not available!");
                        }
                    }
                    break;
                case 4:
                    //deposit money
                    System.out.println("Enter Account Number : ");
                    num=sc.nextInt();
                    found=false;
                    if(count==0){
                        System.out.println("No account available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(accountNumber[i]==num){
                                System.out.print("Enter amount to be deposited: ");
                                int amount=sc.nextInt();
                                balance[i]+=amount;
                                System.out.println("Amount added succesfully!");
                                System.out.println("Current Balance : " + balance[i]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Account not available!");
                        }
                    }
                    break;
                case 5:
                    //withdraw money
                    System.out.println("Enter Account Number : ");
                    num=sc.nextInt();
                    found=false;
                    if(count==0){
                        System.out.println("No account available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(accountNumber[i]==num){
                                found=true;
                                System.out.print("Enter amount to be withdraw: ");
                                int amount=sc.nextInt();
                                if(amount>balance[i]){
                                    System.out.println("Not enough balance!");
                                }else{
                                    balance[i]-=amount;
                                    System.out.println("Amount withdraw succesfully!");
                                    System.out.println("Current Balance : " + balance[i]);
                                    break;
                                }  
                            }
                        }
                        if(!found){
                            System.out.println("Account not available!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }while(option!=6);

        sc.close();
    }
}