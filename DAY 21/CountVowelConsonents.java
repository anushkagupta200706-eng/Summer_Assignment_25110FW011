import java.util.Scanner;
public class CountVowelConsonents {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();

        int vowels = 0 , consonents = 0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
               ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowels++;
            }else{
                consonents++;
            }
        }
        System.out.println("Vowels count = " + vowels);
        System.out.println("Consonents count = " + consonents);
        sc.close();
    }
}
