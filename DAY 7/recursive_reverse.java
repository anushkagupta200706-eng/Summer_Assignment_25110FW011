import java.util.Scanner;
public class recursive_reverse {
    static int rev=0;
    public static void reverse(int n){
        if(n==0){
            return;
        }
        rev=rev*10 + n%10;
        reverse(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        if(num<0){
            System.out.print("-");
            num=-num; //give absolute value of negative num entered
        }
        reverse(num);
        System.out.println(rev);
        sc.close();
    }
    
}
