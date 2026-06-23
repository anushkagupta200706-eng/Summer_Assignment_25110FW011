import java.util.Scanner;
public class MaxOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();
        
        char maxchar=' ';
        int maxcount=0;

        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                maxchar=str.charAt(i);
            }
        }
        
        System.out.println("Maximum occuring Character = " + maxchar);
        System.out.println("Frequency = " + maxcount);
        sc.close();
    }
}
