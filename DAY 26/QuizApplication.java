import java.util.Scanner;
public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***CODING QUIZ***");
        System.out.println("RULES: There will be 3 questions. Enter your selected option");
        System.out.println();
        int score = 0;

        System.out.println("QUESTION 1: ");
        System.out.println("Which data type is used to store whole numbers in Java?");
        System.out.println("1- double");
        System.out.println("2- char");
        System.out.println("3- String");
        System.out.println("4- int");
        System.out.print("Enter your answer: ");
        int option1 = sc.nextInt();
        if(option1 == 4){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Wrong!");
        }
        System.out.println();

        System.out.println("QUESTION 2: ");
        System.out.println("Which symbol is used to end a statement in Java?");
        System.out.println("1- :");
        System.out.println("2- .");
        System.out.println("3- ;");
        System.out.println("4- ,");
        System.out.print("Enter your answer: ");
        int option2 = sc.nextInt();
        if(option2 == 3){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Wrong!");
        }
        System.out.println();

        System.out.println("QUESTION 3: ");
        System.out.println("Which language is primarily used to develop Android applications?");
        System.out.println("1- Python");
        System.out.println("2- Java");
        System.out.println("3- HTML");
        System.out.println("4- C");
        System.out.print("Enter your answer: ");
        int option3 = sc.nextInt();
        if(option3 == 2){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Wrong!");
        }
        System.out.println();

        System.out.println("\n===== QUIZ FINISH =====");
        System.out.println();
        System.out.println("Your result = " + score + "/3");

        if(score == 3){
            System.out.println("Excellent!");
        }else if(score == 2){
            System.out.println("Good Job!");
        }else{
            System.out.println("Keep Practicing!");
        }
        System.out.println();

        System.out.println("The correct answers are : ");
        System.out.println("QUESTION 1: option(4) int");
        System.out.println("QUESTION 2: option(3) ;");
        System.out.println("QUESTION 3: option(2) Java");

        sc.close();
    }
}
