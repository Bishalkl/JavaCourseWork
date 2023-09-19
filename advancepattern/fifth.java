package advancepattern;

public class fifth {
    public static void main(String[] args) {
        int n =5;
        // First half
        //  outer loop
        for(int i=1; i<=5; i++){
            // inner loop for column
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //  Second half
        //  outer loop
        for( int i=n; i>=1; i--){
             for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
