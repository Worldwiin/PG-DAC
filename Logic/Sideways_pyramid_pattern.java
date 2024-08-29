public class Sideways_pyramid_pattern {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int sp = 1; sp <= num - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= num - 1; i++) {
            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = num - 1; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
