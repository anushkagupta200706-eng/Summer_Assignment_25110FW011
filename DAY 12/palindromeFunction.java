import java.util.Scanner;
public class palindromeFunction {
    public static boolean checkPalindrome(int n){
        int original=n;
        int reverse=0;
        for(int i=1;i<=n;i++){
            int digit=n%10;
            reverse=reverse*digit+10;
            n/=10;
        }  
        return original==reverse;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        if(checkPalindrome(num)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT A PALINDROME");
        }
        sc.close();
    }
}
