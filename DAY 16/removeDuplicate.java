import java.util.Scanner;
public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(num[i]==num[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(num[i]+" ");
            }
        }
        sc.close();
    }
}
