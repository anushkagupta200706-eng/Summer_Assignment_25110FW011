import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        
        System.out.println("enter given sum: ");
        int sum = sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]+num[j]==sum){
                    System.out.println("Given pair: (" +  num[i] + "," + num[j] + ")");
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("No Pair found");
        }
        sc.close();
    }
}
