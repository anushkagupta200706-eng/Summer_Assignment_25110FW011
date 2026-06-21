import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();

        System.out.print("Reversed String = ");
        
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
