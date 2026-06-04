import java.util.*;
public class Armstrong_numbers_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting number: ");
        int start=sc.nextInt();
        System.out.println("enter ending number: ");
        int end =sc.nextInt();
        System.out.println("Armstrong numbers in given range are: ");
        for(int num=start;num<=end;num++){
            int original_num=num;
            int count=0;
            int sum=0;
            //count number of digits
            for(int j=num ; j>0 ; j/=10){
                count++;
            }
            //calculate Armstrong sum
            for(int j=num ; j>0 ; j/=10){
                int digit=j%10;
                sum+=(int) Math.pow(digit,count);
            }
            if(sum==original_num){
                System.out.print(original_num + " ");
            }
        }
        sc.close();
    }
}
