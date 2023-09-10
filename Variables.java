import java.util.Scanner;

public class Variables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();

        int multi = a * b;
        int sub = a - b;

        int ans = multi / sub;

        System.out.println(ans);
    }
}