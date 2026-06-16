import java.util.Scanner;
public class MaxFrequencyElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int maxfreq=0;
        int element=num[0];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
            if(count>maxfreq){
                maxfreq=count;
                element=num[i];
            }
        }
        System.out.println("Element = " + element);
        System.out.println("Maximum Frequency = " + maxfreq);
        sc.close();
    }
}
