import java.util.Scanner;
public class digits_products {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        int digit;
        int product=1;
        while(num>0){
            digit= num%10; //extract last digit
            product*=digit; //product of digits
            num/=10; //remove last digit
        }
        System.out.println("product of digits of given number: " + product);
        sc.close();
    }
    
}
