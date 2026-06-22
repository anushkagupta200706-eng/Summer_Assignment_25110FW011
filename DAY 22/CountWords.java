import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();
        
        int words=1;
        if(str.length()==0){
            words=0;
        }else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    words++;
                }
            }
        }
        System.out.println("Number of words = " + words);
        sc.close();
    }
}
