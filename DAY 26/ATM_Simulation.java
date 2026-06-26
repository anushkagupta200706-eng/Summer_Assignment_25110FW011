import java.util.Scanner;
public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        System.out.println("What do you want to do?");
        System.out.println("1- CHECK BALANCE");
        System.out.println("2- DEPOSIT MONEY");
        System.out.println("3- WITHDRAW MONEY");
        System.out.print("Enter option number: ");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("BALANCE = " + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double dep = sc.nextDouble();
                balance += dep;
                System.out.println("Updated Balance = " + balance);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();
                if(withdraw <= balance){
                    balance -= withdraw;
                    System.out.println("Updated Balance = " + balance);
                }else{
                    System.out.println("INSUFFICIENT BALANCE!!");
                }
                break;
            default:
                System.out.println("INVALID OPTION!!");
            
        }
        sc.close();
    }
}
