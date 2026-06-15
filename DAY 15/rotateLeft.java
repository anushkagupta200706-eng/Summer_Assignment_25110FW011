import java.util.Scanner;
public class rotateLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        int first = num[0];
        for(int i = 0; i < n - 1; i++) {
            num[i] = num[i + 1];
        }
        num[n - 1] = first;

        System.out.println("Array after left rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
