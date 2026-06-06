import java.util.*;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a decimal number: ");
        int deciNum=sc.nextInt();
        int original=deciNum;
        int power=0;
        int binNum=0;
        while(deciNum>0){
            int rem=deciNum % 2;
            binNum+=rem*(Math.pow(10,power));
            power++;
            deciNum/=2;
        }
        System.out.println("Binary of " + original + "= " + binNum);
        sc.close();
    }
}
