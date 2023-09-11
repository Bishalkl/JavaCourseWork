import java.util.Scanner;
public class Variables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        String c = sc.nextLine();

        int multi = a * b;
        int sub = a - b;
        int sum = a + b;

        int ans = multi / sub;

        System.out.println(c);
        System.out.println(ans);
        System.out.println(sum);

        System.out.println("Hello world");


//      1.Exercise no 1:
        int age = sc.nextInt();
        float marks = sc.nextFloat();

        System.out.println(age);
        System.out.println(marks);
        
//       Exercise no 2:;
        double radius = sc.nextDouble();
        
        double area = Math.PI * Math.pow(radius , 2);
        System.out.println(area);
       
    }
}