import java.util.Scanner;
public class VotingEligibilitySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age<0){
            System.out.println("INVALID AGE!");
        }else if(age>=18){
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
        }else{
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
        }
        sc.close();
    }
}
