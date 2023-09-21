package function;

import java.util.*;
public class ExerciseOne {
    // declaring the function
    public static boolean isPrime(int n){
        // condtion for if i is greater than 1 or not
        if( n<=1){
            return false;
        }
        // check for divisibility
        for( int i=2; i<= Math.sqrt(n); i++){
            if(n % 1 == 0){
                return false;
            }
        }
        // if all failed prime is return true at last
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("it is a prime number");
        }else{
            System.out.println("it is not a prime number");
        }
        // closing the scanner 
        sc.close();
    }

}
