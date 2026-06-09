public class reverse_pyramid {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            //spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
