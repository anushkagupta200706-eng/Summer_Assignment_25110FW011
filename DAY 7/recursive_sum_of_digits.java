import java.util.Scanner;
public class recursive_sum_of_digits {
    public static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + digitSum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        System.out.println("sum of digits = " + digitSum(num));
        sc.close();
    }
}
