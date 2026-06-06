import java.util.Scanner;
public class power_without_pow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number as x: ");
        int x=sc.nextInt();
        System.out.print("enter the power as n: ");
        int n=sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            result*=x;
        }
        System.out.println(x + "^" + n + "= " + result);
        sc.close();
    }
}
