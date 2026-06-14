import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(num[i]>largest){
                secondLargest=largest;
                largest=num[i];
            }else if(num[i]>secondLargest && num[i]!=largest){
                secondLargest=num[i];
            }
        }
        
        System.out.println("Second largest element = " + secondLargest);
        sc.close();
    }
}
