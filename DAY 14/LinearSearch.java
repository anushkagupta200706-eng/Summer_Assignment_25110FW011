import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(key==num[i]){
               return i;
            }   
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("enter key to be searched: ");
        int key=sc.nextInt();
        
        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index = " + index);
        }
        sc.close();
    }
}
 