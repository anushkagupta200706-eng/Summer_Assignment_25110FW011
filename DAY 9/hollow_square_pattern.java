public class hollow_square_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5){
                    System.out.print("*");
                }else if(j==1 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }   
}
