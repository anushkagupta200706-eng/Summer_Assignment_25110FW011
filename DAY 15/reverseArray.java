import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.println("Reversed array: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
