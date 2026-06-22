import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();

        System.out.print("enter character to find frequency: ");
        char ch=sc.next().charAt(0);

        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        } 
        System.out.println("Frequency of " + ch + " = " + count);
        sc.close();
    }
}
