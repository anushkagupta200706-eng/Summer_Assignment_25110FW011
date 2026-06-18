import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int arr[],int n, int key){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){ //found
                return mid;
            }else if(arr[mid]>key){ //left
                end=mid-1;
            }else{ //right
                start=mid+1;
            }
        }
        return -1;
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
        
        Arrays.sort(arr);
        System.out.print("enter key to be searched: ");
        int key=sc.nextInt();

        int index=binarySearch(arr, n, key);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is found at index: " + index);
        }
        sc.close();
    }
}
