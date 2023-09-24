package exercise;

import java.util.*;
public class ExerciseThree {
    // function
    public static void CheckGreater(int a, int b){
        if( a > b){
            System.out.println("a is a greater number: ");
        }else if(a < b){
            System.out.println("b is a greater number: ");
        }else{
            System.out.println("Both number is equal");
        }
        return;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter the first number: ");
       int a = sc.nextInt();
       System.out.print("Enter the second number: ");
       int b = sc.nextInt();

       CheckGreater(a, b);
       sc.close();
    }
}
