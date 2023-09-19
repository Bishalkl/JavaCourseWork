package advancepattern;

public class forth {
    public static void main(String[] args) {
        int n =5;

        for(int i=1; i<=n; i++){
            // inner loop for space
            for(int j=1; j<=n-i; j++){
                System.out.print("-");
            }
            // inner loop for first half
            for(int j=i; j>=1; j--){ // when we don j-- it will work reversed 
                System.out.print(j);
            }

            // inner loop for second half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

