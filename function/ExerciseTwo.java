package function;

import java.util.*;
public class ExerciseTwo {
    // declaring the function for the even or not
    public static boolean isEven(int n){
        if( n > 1 && n % 2 == 0 ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // condition for return
        if(isEven(num)){
            System.out.println("It is a even number");
        }else{
            System.out.println("It is not a even number");
        }
        // closing the scanner 
        sc.close();
    }

}