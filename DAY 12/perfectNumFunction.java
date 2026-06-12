import java.util.Scanner;
public class perfectNumFunction {
    public static boolean checkPerfect(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        if(checkPerfect(num)){
            System.out.println("PERFECT NUMBER");
        }else{
            System.out.println("NOT PERFECT NUMBER");
        }
        sc.close();
    }    
}
