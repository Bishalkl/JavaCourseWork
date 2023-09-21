package function;

import java.util.*;
public class ExerciseThree {
    //declaring the function for table of number
    public static void tableOperation(int n){
        
        // for loop create a table
        for(int i =1; i<=10; i++){
            int product =  n * i;
            System.out.println(n + " * " + i + " = " + product );
        }
        // just return void
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();

        // condition to check number is suitable or not
        if( n >=1){

            //  callint the function
            tableOperation(n);
        }else{
            System.out.println("invalid number!!!");
        }

        // closing the scanner
        sc.close();
    }
}
