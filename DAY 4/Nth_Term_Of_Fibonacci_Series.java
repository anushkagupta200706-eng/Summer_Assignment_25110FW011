import java.util.Scanner;
public class Nth_Term_Of_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the term: ");
        int n=sc.nextInt();
        int term,a=0,b=1,c=0;
        if(n==0){
            term=1;
        }else if(n==1){
            term=2;
        }else{
            for(int i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            term=c;
        }
        System.out.println("The "+n+"th term of Fibonacci series is: "+ term);
        sc.close();
    }
}
