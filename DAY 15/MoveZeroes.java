import java.util.Scanner;
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        int index = 0;
        for(int i = 0; i < n; i++) {
            if(num[i] != 0) {
                num[index] = num[i];
                index++;
            }
        }

        while(index < n) {
            num[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeroes:");
        for(int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
