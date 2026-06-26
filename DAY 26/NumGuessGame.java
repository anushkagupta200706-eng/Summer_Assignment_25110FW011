import java.util.Scanner;
public class NumGuessGame{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=(int) (Math.random()*100)+1;
        System.out.println("***WELCOME TO NUMBER GUESS GAME***");
        System.out.println("You have to enter your guess between 1 to 100");
        int count=0,guess=0;

        do{
            System.out.print("Enter guess: ");
            guess = sc.nextInt();
            count++;
            if(guess>num){
                System.out.println("TOO HIGH GUESS");
            }else if(guess<num){
                System.out.println("TOO LOW GUESS");
            }
        }while(guess!=num);

        System.out.println("CORRECT!! The secret number was " + num);
        System.out.println("You guessed in " + count + " attempts");
        sc.close();
    }
}