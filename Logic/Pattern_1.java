public class Pattern_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {

            for (int s = 1; s <= 3 - i; s++) {
                System.out.print(" ");
            }

            for (int j = 3; j >= 3 - i + 1; j--) {
                System.out.print(j);
            }

            for (int r = 3 - i + 2; r <= 3; r++) {
                System.out.print(r);
            }
            System.out.println();
        }

        for (int i = 2; i >= 1; i--) {

            for (int s = 1; s <= 3 - i; s++) {
                System.out.print(" ");
            }

            for (int j = 3; j >= 3 - i + 1; j--) {
                System.out.print(j);
            }

            for (int r = 3 - i + 2; r <= 3; r++) {
                System.out.print(r);
            }
            System.out.println();
        }
    }
}