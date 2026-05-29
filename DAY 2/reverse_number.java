import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int reverse=0; int digit;
        while(num>0){
            digit=num%10; //extract last digit
            reverse = reverse*10 + digit;
            num/=10;
        }
        System.out.println("Reversed Number: " + reverse);  
    }   
}
