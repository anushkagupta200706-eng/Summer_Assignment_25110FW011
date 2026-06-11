import java.util.Scanner;
public class max_function {
    public static double calcMax(double a,double b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("enter second number: ");
        double num2=sc.nextDouble();
        if(num1==num2){
            System.out.println("Both numbers are equal");
        }
        System.out.println("The Maximum number = " + calcMax(num1,num2));
        sc.close();
    }
}
