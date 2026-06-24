import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();
        
        String word="",longest="";
        for(int i=0;i<str.length();i++){
             if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            }else {
                if (word.length() > longest.length()){
                    longest = word;
                }
                word = "";
            }
        }
        if (word.length() > longest.length()){
            longest = word;
        }
        System.out.println("Longest Word = " + longest);
        sc.close();  
    }
}
