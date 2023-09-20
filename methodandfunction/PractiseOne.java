package methodandfunction;

import java.util.*;

public class PractiseOne {

    // creating function for sum operation
    public static void SumOperation(int a , int b){
        int sum = a + b;
        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaring for user to input the function
        int a = sc.nextInt();
        int b = sc.nextInt();

        SumOperation(a,b); // calling the function
        sc.close();
    }


}
