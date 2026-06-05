import java.util.Scanner;
public class strong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        int original=num;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if(sum==original){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong number");
        }
        sc.close();
    }
}
