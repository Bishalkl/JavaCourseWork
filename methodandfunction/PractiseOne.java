package methodandfunction;

import java.util.*;

public class PractiseOne {

    // creating function for sum operation
    public static int SumOperation(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = SumOperation(a, b);
        System.out.println("Sum of two numbers is "+ sum);
        sc.close();
    }


}
