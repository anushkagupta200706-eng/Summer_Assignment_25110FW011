import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();

        boolean palindrome=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                palindrome=false;
                break;
            }
        }
        if(palindrome){
            System.out.println("PALINDROME STRING");
        }else{
            System.out.println("NOT A PALINDROME STRING");
        }
        sc.close();
    }
}
