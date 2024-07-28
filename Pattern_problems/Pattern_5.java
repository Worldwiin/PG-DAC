public class Pattern_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j < 6; j++) {
                    System.out.print(i);
                }
                System.out.print(i + 1);
            } else {
                System.out.print(i);
                for (int j = 1; j < 6; j++) {
                    System.out.print(i - 1);
                }
            }
            System.out.println();
        }
    }
}
