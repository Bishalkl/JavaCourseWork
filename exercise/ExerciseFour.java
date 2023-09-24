package exercise;

import java.util.*;
public class ExerciseFour {
    // declaring the fuction to calculate a cicumference
    public static double CircumCalcuate(double r){
        double c = 2 * r * Math.PI;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        System.out.println("The circumference of a circle is "+CircumCalcuate(r)+".");
        sc.close();

    }

}
