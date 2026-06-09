public class character_pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //increasing characters
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            //decreasing characters
            c-=2;
            for(int j=i-1;j>=1;j--){
                System.out.print(c);
                c--;
            }
            System.out.println();
        }    
    }
}
