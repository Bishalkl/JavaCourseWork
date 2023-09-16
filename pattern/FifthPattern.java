package pattern;

public class FifthPattern {
    public static void main(String[] args) {
        int f = 5;
        for(int i=1; i<=5; i++){
            for(int j = 1; j<=f-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
