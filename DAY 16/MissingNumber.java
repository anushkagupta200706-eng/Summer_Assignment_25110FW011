//here we assume that given array has 1 to n numbers and 1 number missing
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        int expectedSum = n*(n+1)/2;
        int actualSum=0;;
        for(int i=0;i<n-1;i++){
            actualSum+=num[i];
        }
        System.out.println("Missing Number = " + (expectedSum - actualSum));
        sc.close();
    }
}
