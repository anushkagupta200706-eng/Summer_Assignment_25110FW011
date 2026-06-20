import java.util.Scanner;
public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of square matrix: ");
        int n= sc.nextInt();

        int a[][]=new int[n][n];

        System.out.println("enter matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean symmetric=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=a[j][i]){
                    symmetric=false;
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("SYMMERTRIC MATRIX");
        }else{
            System.out.println("NOT SYMMETRIC MATRIX");
        }
        sc.close();
    }
}
