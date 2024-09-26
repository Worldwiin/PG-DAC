public class Inverted_star_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int r = i - 1; r >= 1; r--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
