public class Pattern_6 {
    public static void main(String[] args) {
        int i, j, n, p;

        for (i = 1; i <= 4; i++) {
            n = 0;
            p = 3;

            for (j = i; j >= 1; j--) {
                System.out.print(i + n);
                n = n + p--;
            }

            System.out.println();
        }
    }
}

1
25
368
47910

