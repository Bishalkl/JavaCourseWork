package methodandfunction;

import java.util.*;
public class PractiseThree {
    
    //declearing the function for finding factorial number
    public static int factorialOperation(int a){
        int factorial = 1;
        // using condtion if the number is suitable or not
        if( a > 0){
            for(int i=a; i>=1; i--){
                factorial = factorial * i;
            }
        System.out.println(factorial);
        }else if( a == 0){
                factorial = 0;
        }else{
            throw new IllegalArgumentException("It is negative number");
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try{
            System.out.println("The factorial of the number you entered is " + factorialOperation(a));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }

}
