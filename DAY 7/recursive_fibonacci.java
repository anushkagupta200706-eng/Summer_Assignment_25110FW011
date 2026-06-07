import java.util.Scanner;
public class recursive_fibonacci{
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Invalid! Enter positive number");
        }else{
            System.out.println("Fibonacci term = " + fibonacci(num));
        }
        sc.close();
    }
}