import java.util.Scanner;
public class Variables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if (c == 1){
            int sum = a + b;
            System.out.println(sum);
        }else if(c == 2){
            int sub = a - c;
            System.out.println(sub);
        }else if(c == 3){
            int multi= a * c;
            System.out.println(multi);
        }else if(c == 4){
            int divi = a / b;
            System.out.println(divi);
        }else if(c == 5){
            int mod = a % b;
            System.out.println(mod);
        }else{
            System.out.println("Invalid input");
        }

        switch(d){
            case 1 : System.out.println("January");
            break ;

            case 2 : System.out.println("February");
            break ;

            case 3 : System.out.println("March");
            break ;

            case 4 : System.out.println("April");
            break ;

            case 5 : System.out.println("May");
            break ;

            case 6 : System.out.println("June");
            break ;

            case 7 : System.out.println("July");
            break ;

            case 8 : System.out.println("August");
            break ;

            case 9 : System.out.println("September");
            break ;

            case 10 : System.out.println("October");
            break ;

            case 11 : System.out.println("November");
            break ;

            case 12 : System.out.println("December");
            break ;

            default: System.out.println("Invaild Input");

            
        }
        
        sc.close();
       
    }
}