public class DiamondBorder {
    public static void main(String[] args) {
        int i, j, n = 4;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                if (i == 1 || i == n || j == n || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}