import java.util.*;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number: ");
        int binNum=sc.nextInt();
        int deciNum=0,power=0;
        int original=binNum;
        while(binNum>0){
            int digit=binNum%10;
            deciNum+=digit*(Math.pow(2,power));
            power++;
            binNum/=10;
        }
        System.out.println("Decimal of " + original + "= " + deciNum);
        sc.close();
    }
}
