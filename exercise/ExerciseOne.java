package exercise;

import java.util.*;

public class ExerciseOne {

    // declearing the function
    public static int averageOperation(int a, int b, int c){
        int sum = a + b + c;
        int total = sum / 3;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();


        System.out.println("The result is: " +averageOperation(a, b, c));
        sc.close();

    }
}
