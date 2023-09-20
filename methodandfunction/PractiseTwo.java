package methodandfunction;

import java.util.*;
public class PractiseTwo {

    // declaring the function for product operaction
    public static int productOperation(int a, int b){
        int prod = a * b;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // calling the function
        int prod = productOperation(a, b);
        System.out.println("The product of two numbers is "+ prod);
        sc.close();
    }
}
