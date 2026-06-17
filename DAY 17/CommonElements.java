import java.util.Scanner;
public class CommonElements {
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
        System.out.println("Common elements: ");
        for(int i=0;i<n1;i++){
            boolean found=false;
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
            boolean printed=false;
            for(int k=0;k<i;k++){
                if(arr1[k]==arr1[i]){
                    printed=true;
                    break;
                }
            }
            if(found && !printed){
                System.out.print(arr1[i] + " ");
            }
        }
        sc.close();
    }
}
