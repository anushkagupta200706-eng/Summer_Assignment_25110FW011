import java.util.Scanner;
public class OddEvenCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int evenCount=0 ,oddCount=0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        
        System.out.println("Total Even elements count: " + evenCount);
        System.out.println("Total Odd elements count: " + oddCount);
        sc.close();
    }
}
