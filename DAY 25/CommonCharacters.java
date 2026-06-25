import java.util.Scanner;
public class CommonCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter first string: ");
        String str1=sc.nextLine();

        System.out.print("enter second string: ");
        String str2=sc.nextLine();
        
        System.out.println("Common Characters: ");
        for(int i=0;i<str1.length();i++){
            boolean printed=false;
            for(int k=0;k<i;k++){
                if(str1.charAt(i)==str1.charAt(k)){
                    printed=true;
                    break;
                }
            }
            if(printed){
                continue;
            }
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    System.out.println(str1.charAt(i));
                    break;
                }
            }
        }
        sc.close();
    }
}
