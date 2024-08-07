public class Pattern_3 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 3; i++) {
            for (int s = i; s < 3; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.print("2");
                } else {
                    System.out.print("1");
                }
            }
            n = n + 2;
            System.out.println();
        }
    }
}