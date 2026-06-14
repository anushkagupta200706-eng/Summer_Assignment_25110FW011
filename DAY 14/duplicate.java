import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.println("duplicate elements are: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                    break;
                }
            }
        }
        sc.close();
    }
}
