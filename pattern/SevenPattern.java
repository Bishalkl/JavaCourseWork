package pattern;

public class SevenPattern {
    public static void main(String[] args) {
        // for row number
        int r = 5;

        //row for outer loop
        for(int i= 1; i<=r; i++){

            //column for inner loop
            for(int j=1; j<=i; j++){

                // for maing execute
                int sum = i + j;

                // condtion to print where 1 and where to 0 
                if(sum % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            
            // to print another line after executing after the row 
            System.out.println();
        }
    }
}
