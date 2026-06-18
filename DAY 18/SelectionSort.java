import java.util.Scanner;
public class SelectionSort {
    public static void sort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        sort(arr, n);
        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
