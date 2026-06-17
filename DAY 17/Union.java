import java.util.Scanner;
public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of first array: ");
        int n1=sc.nextInt();

        int arr1[]=new int[n1];

        System.out.println("enter array elements: ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("enter size of second array: ");
        int n2=sc.nextInt();

        int arr2[]=new int[n2];

        System.out.println("enter array elements: ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        int union[]=new int[n1+n2];
        int k=0;
        //add unique elements of first array
        for(int i=0;i<n1;i++){
            boolean found=false;
            for(int j=0;j<k;j++){ 
               if(union[j]==arr1[i]){
                found=true;
                break;
               }
            }
            if(!found){
                union[k]=arr1[i];
                k++;
            }
        }
        //add unique elements of second array
        for(int i=0;i<n2;i++){
            boolean found=false;
            for(int j=0;j<k;j++){
                if(union[j]==arr2[i]){
                    found=true;
                    break;
                }
            }
            if(!found){
                union[k]=arr2[i];
                k++;
            }
        }
 
        System.out.print("Union: ");
        for(int i=0;i<k;i++){
            System.out.print(union[i] + " ");
        }
        sc.close();
    }
}
