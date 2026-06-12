import java.util.*;
public class armstrongFunction {
    public static boolean checkArmstrong(int n){
        int original=n;
        int count=0,sum=0;
        //count digits
        while(n>0){
            count++;
            n/=10;
        }
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit, count);
            temp/=10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        if(checkArmstrong(num)){
            System.out.println("ARMSTRONG NUMBER");
        }else{
            System.out.println("NOT A ARMSTRONG NUMBER");
        }
        sc.close();
    }    
}
