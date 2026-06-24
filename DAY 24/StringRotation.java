import java.util.Scanner;
public class StringRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter first string: ");
        String str1=sc.nextLine();

        System.out.print("enter second string: ");
        String str2=sc.nextLine();
         
        if(str1.length()!=str2.length()){
            System.out.println("Not Rotation");
        }else{
            String temp = str1+str1;
            if(temp.contains(str2)){
                System.out.println("Rotation");
            }else{
                System.out.println("Not Rotation");
            }
        }
        sc.close();
    }
}
