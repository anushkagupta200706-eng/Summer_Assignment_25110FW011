import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter rows: ");
        int r=sc.nextInt();

        System.out.println("enter columns: ");
        int c=sc.nextInt();

        int a[][]=new int[r][c];

        System.out.println("enter matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix: ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
