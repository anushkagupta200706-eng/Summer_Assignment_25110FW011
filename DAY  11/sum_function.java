import java.util.Scanner;
public class sum_function{
    public static double calcSum(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("enter second number: ");
        double num2=sc.nextDouble();
        System.out.println("The sum = " + calcSum(num1, num2));
        sc.close();
    }
}