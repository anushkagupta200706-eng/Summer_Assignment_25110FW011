import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of square matrix:");
        int n=sc.nextInt();

        int a[][]=new int[n][n];

        System.out.println("enter matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i][i];
        }
        
        System.out.println("Diagonal sum = " + sum);
        sc.close();
    }
}
