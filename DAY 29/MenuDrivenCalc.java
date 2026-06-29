import java.util.Scanner;
public class MenuDrivenCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,option;
        do{
            System.out.println("What do you want to do? Choose from options below: ");
            System.out.println("1- ADDITION");
            System.out.println("2- SUBTRACTION");
            System.out.println("3- MULTIPLICATION");
            System.out.println("4- DIVISION");
            System.out.println("5- EXIT");
            option=sc.nextInt();
            switch (option) {
                case 1:
                    //add
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();

                    System.out.println("Sum = " + (num1 + num2));
                    break;
                case 2:
                    //subtract
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();

                    System.out.println("Difference = " + (num1 - num2));
                    break;
                case 3:
                    //multiply
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();

                    System.out.println("Product = " + (num1 * num2));
                    break;
                case 4:
                    //divide
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();

                    if(num2!=0){
                        System.out.println("Division = " + (num1 / num2));
                    }else{
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;    
                default:
                    System.out.println("Invalid Option!");
                    break;
            }

        }while(option!=5);

        sc.close();
    }
}
