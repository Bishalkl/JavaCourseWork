package pattern;

public class FifthPattern {
    public static void main(String[] args) {
        int c = 5;
        int r = 5;
        for(int i=1; i<=r; i++){
            for(int j = 1; j<=c; j++){
                System.out.print(j);
            }
            c--;
            System.out.println();
        }
    }
}
