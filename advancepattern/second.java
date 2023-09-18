package advancepattern;

public class second {
    public static void main(String[] args) {
         int n =4;
        //  outer loop for row 
         for(int i=n; i>=1; i--){
            // inner loop for space
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            // innerloop for star
            for(int j=1; j<=n+1; j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
