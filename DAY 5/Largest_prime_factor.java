import java.util.Scanner;
public class Largest_prime_factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        int largestPrimeFactor=1;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                boolean isPrime=true;
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    largestPrimeFactor=i;
                }
            }
        }
        System.out.println("Largest Prime Factor is: " + largestPrimeFactor);
        sc.close();
    }
}

