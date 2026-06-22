import java.util.Scanner;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();

        System.out.print("String without spaces: ");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
