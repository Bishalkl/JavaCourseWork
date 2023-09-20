package methodandfunction;

import java.util.*;
public class PractiseTwo {

    // declaring the function for product operaction
    public static int productOperation(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // calling the function
        System.out.println("The product of two numbers is "+ productOperation(a, b));
        sc.close();
    }
}
