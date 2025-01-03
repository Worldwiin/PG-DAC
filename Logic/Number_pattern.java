public class Number_pattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                for (int k = n; k > i; k--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
/*
333222111
332211
321
*/