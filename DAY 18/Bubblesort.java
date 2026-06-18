import java.util.Scanner;
public class Bubblesort {
    public static void sort(int arr[],int n){
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
