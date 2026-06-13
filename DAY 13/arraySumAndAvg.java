import java.util.Scanner;
public class arraySumAndAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        
        double avg= sum/n;
        System.out.println("the sum of array = " + sum);
        System.out.println("the average of array = " + avg);
        sc.close();
    }    
}
