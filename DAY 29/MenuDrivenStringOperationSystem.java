import java.util.Scanner;
public class MenuDrivenStringOperationSystem {
    public static String enterString(Scanner sc){
        sc.nextLine(); 
        System.out.print("Enter String: ");
        String str = sc.nextLine(); 
        return str;
    }

    public static void displayString(String str){
        System.out.println("String: " + str);
    }

    public static void findLength(String str){
        int len=str.length();
        System.out.println("String length : " + len);
    }

    public static void toUpper(String str){
        System.out.println(str.toUpperCase());
    }

    public static void toLower(String str){
        System.out.println(str.toLowerCase());
    }

    public static void reverseString(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        int option;
        do{
            System.out.println("What do you want to do? Choose from options below: ");
            System.out.println("1- ENTER STRING");
            System.out.println("2- DISPLAY STRING");
            System.out.println("3- FIND LENGTH");
            System.out.println("4- CONVERT TO UPPERCASE");
            System.out.println("5- CONVERT TO LOWERCASE");
            System.out.println("6- REVERSE STRING");
            System.out.println("7- EXIT");
            option=sc.nextInt();

            switch(option){
                case 1:
                    str = enterString(sc);
                    break;

                case 2:
                    displayString(str);
                    break;

                case 3:
                    findLength(str);
                    break;

                case 4:
                    toUpper(str);
                    break;

                case 5:
                    toLower(str);
                    break;

                case 6:
                    reverseString(str);
                    break;

                case 7:
                    System.out.println("Thank you!");
                    break;
                 
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }while(option!=7);

        sc.close();
    }
}
