import java.util.*;
public class Armstrong_number_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked: ");
        int num=sc.nextInt();
        int original_num=num;
        int digit;int final_num = 0;
        int count=0;
        //count number of digits
        while(num>0){
            count++;
            num/=10; //remove last digit
        }
        //calculate final number
        num=original_num;
        while(num>0){
            digit=num%10;
            final_num+=(int) Math.pow(digit,count);
            num/=10;
        }
        //checking final number with original number
        if(original_num==final_num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }   
}
