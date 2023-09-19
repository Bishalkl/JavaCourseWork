package advancepattern;

public class third {
    public static void main(String[] args) {
        int n =1;
        // outer loop for row
        for(int i=1; i<=5; i++){
            // inner loop for space loop 
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }

            // inner loop for column
            for(int j=1; j<=i; j++){
                System.out.print(n +" ");
                
            }
            System.out.println();
            n++;
            
        }
    }
}
