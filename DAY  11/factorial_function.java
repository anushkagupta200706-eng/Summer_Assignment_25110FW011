import java.util.Scanner;
public class factorial_function {
    public static int calcFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + calcFactorial(num));
        sc.close();
    }
}
