import java.util.Scanner;
public class recursive_factorial{
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        System.out.println("Factorial of " + num + "= " + factorial(num));
        sc.close();
    }
}
    

