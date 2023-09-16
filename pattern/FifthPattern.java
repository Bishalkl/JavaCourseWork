package pattern;

public class FifthPattern {
    public static void main(String[] args) {
        int f = 4;
        for(int i=1; i<=4; i++){
            for(int j = 1; j<=f; j++){
                System.out.print(j);
            }
            f--;
            System.out.println();
        }
    }
}
