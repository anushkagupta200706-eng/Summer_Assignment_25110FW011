import java.util.*;
public class LargestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int largest = Integer.MIN_VALUE; //smallest possible int
        int smallest = Integer.MAX_VALUE; //largest possible int

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
        sc.close();
    }
}
