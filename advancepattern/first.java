package advancepattern;

public class first {
    public static void main(String[] args) {
        int n = 4;
        // for outerloop
        for(int i=1; i<=4; i++){
            // for inner star loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for inner space loop
            int loop = n-i;
            for(int j=1; j<=2*loop; j++){
                System.out.print(" ");
            }
            // for innner loop reversed star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            // for inner star loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for inner space loop
            int loop = n-i;
            for(int j=1; j<=2*loop; j++){
                System.out.print(" ");
            }
            // for innner loop reversed star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }


    }
}
