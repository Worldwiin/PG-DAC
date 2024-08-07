public class Pattern_4 {
    public static void main(String[] args) {
        int n = 69;
        for (int i = 1; i <= 5; i++) {
            for (int j = 65; j <= n; j++) {
                for (int k = j; k <= 69; k++) {
                    System.out.print((char)k);
                }
            }
            n = n - 1;
            System.out.println();
        }
    }
}
/*
ABCDEBCDECDEDEE
ABCDEBCDECDEDE
ABCDEBCDECDE
ABCDEBCDE
ABCDE
*/