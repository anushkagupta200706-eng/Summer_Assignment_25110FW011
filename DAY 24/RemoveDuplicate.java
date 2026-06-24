import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();
        
        String result="";
        for(int i=0;i<str.length();i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                result+=str.charAt(i);
            }
        }
        System.out.println("String after removing duplicates = " + result);
        sc.close();
    }
}
