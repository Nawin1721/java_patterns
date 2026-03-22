public class FullPyramid2 {
    public static void main(String[] args) {
        int n = 4;
        int i, j;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}