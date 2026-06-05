import java.util.Scanner;
public class factor_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        System.out.print("The factors are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
