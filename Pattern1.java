class Pattern1 {
    public static void main() {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 0; i < 4; i++) {
            for (j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}