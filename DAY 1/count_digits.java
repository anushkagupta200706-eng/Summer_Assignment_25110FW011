import java.util.Scanner;
public class count_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer:");
        int num=sc.nextInt();
        int count=0;
        while (num!=0){
            num/=10;
            count+=1;
        }
        System.out.println("the number of digits are:" + count);
        sc.close();
    }   
}
