package function;

import java.util.*;
public class ExerciseThree {
    //declaring the function for table of number
    public static void tableOperation(int n){
        
        // for loop create a table

        for(int i =1; i<=10; i++){
            int product =  n * i;
            System.out.printf("%d * %d = %d%n",n, i, product); // using string format to print it in clean and better way. Likely, %n for next line and %d for integer
        }

        return; // just return void
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();

        // condition to check number is suitable or not
        if( n >=1){
            tableOperation(n); //  calling the function
        }else{
            System.out.println("invalid number!!!");
        }

        sc.close();  //  closing the scanner
    }
}
