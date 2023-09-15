package pattern;
public class ThirdPattern {
    public static void main(String[] args) {
        int r = 4;
        // outerloop
        for(int i=1; i<=4; i++){  
            // inner loop for space
            for(int j=1; j<= r-1; j++){
                System.out.print(" ");
            }

            //inner loop for *
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            r--;
            System.out.println();
        }
    }
}
// ---*
// --**
// -***
// ****

  