package exercise;

import java.util.*;
public class ExerciseTwo {
    // declaring the function
    public static int oddSum(int n){
        // first reset value
        int sum = 0;
        // loop for add 
        for(int i=1; i<=n; i++){
            if(!(i % 2 == 0)){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The result is:" +oddSum(n));
        sc.close();
    }
}
