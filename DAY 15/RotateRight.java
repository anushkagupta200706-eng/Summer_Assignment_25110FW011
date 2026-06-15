import java.util.Scanner;
public class RotateRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        
        int last = num[n - 1];
        for(int i = n - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = last;

        System.out.println("Array after right rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
