import java.util.Scanner;
public class LowerToUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();
        
        System.out.print("Uppercase String: ");
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            System.out.print(ch);
        }
        sc.close();
    }
}
