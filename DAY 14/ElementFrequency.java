import java.util.Scanner;
public class ElementFrequency {
    public static void frequency(int num[],int key){
        int count=0;
        for(int i=0;i<num.length;i++){
            if(key==num[i]){
                count++;
            }
        }
        System.out.println("Frequency of " + key +" = " + count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.print("enter element: ");
        int key=sc.nextInt();
        
        frequency(num, key);
        sc.close();
    }
}
