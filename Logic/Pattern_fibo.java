public class Pattern_fibo {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c);
            }
            System.out.println();
        }

    }
}