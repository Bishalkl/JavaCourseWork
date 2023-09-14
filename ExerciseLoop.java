import java.util.*;

public class ExerciseLoop {
    public static void main(String[] args) {

        // For Loop exercise
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int sum = 0;
		for(int counter = 1; counter <= n; counter++){
		    sum = sum + counter;
		}
		System.out.println(sum);
        sc.close();
    }
}
