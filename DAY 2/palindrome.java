import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be check:");
        int num= sc.nextInt();
        int original_num=num;
        int digit, reverse_num=0;
        while(num>0){
            digit=num%10; //extract last digit
            reverse_num= reverse_num*10 + digit;
            num/=10; //remove last digit
        }
        if(original_num == reverse_num){
            System.out.println("given number is a palindrome");
        }else{
            System.out.println("given number is not a palindrome");
        }
        sc.close();
    }  
}
