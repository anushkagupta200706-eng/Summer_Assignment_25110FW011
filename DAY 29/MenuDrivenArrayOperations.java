import java.util.Scanner;
public class MenuDrivenArrayOperations {
    public static void enterArray(int arr[], int n, Scanner sc){
        for(int i=0;i<n;i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }
    }

    public static void displayArray(int arr[], int n){
        System.out.println("Array Elements: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void searchElement(int arr[], int n, Scanner sc){
        System.out.print("Enter the element to be searched: ");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Element found at index : " + i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found!");
        }
    }

    public static void findLargest(int arr[], int n){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element = " + largest);
    }

    public static void findSmallest(int arr[], int n){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Element = " + smallest);

    }

    public static void selectionSort(int arr[], int n){
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
        System.out.print("Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int option;
        do{
            System.out.println("What do you want to do? Choose from options below: ");
            System.out.println("1- ENTER ARRAY");
            System.out.println("2- DISPLAY ARRAY");
            System.out.println("3- SEARCH ELEMENT");
            System.out.println("4- FIND LARGEST ELEMENT");
            System.out.println("5- FIND SMALLEST ELEMENT");
            System.out.println("6- SORT ARRAY");
            System.out.println("7- EXIT");
            option=sc.nextInt();

            switch (option) {
                case 1:
                    //enter array
                    enterArray(arr, n, sc);
                    break;
                case 2:
                    //display array
                    displayArray(arr, n);
                    break;
                case 3:
                    //search element
                    searchElement(arr, n, sc);
                    break;
                case 4:
                    //largest element
                    findLargest(arr, n);
                    break;
                case 5:
                    //smallest element
                    findSmallest(arr, n);
                    break;
                case 6:
                    //sort array
                    selectionSort(arr, n);
                    break;
                case 7:
                    System.out.println("Thank you!");
                    break; 
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }while(option!=7);

        sc.close();
    }
}
