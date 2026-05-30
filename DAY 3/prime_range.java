import java.util.Scanner;
public class prime_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers are:");
        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
        sc.close();
    }
}
    

