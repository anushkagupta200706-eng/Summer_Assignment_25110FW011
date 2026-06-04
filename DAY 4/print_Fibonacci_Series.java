import java.util.Scanner;
public class print_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        System.out.println("enter the number of terms to display: ");
        int a=0;
        int b=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
}
