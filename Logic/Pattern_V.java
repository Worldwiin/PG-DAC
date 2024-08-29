class Pattern_V {
    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 2 * num - 1; j++) {
                if (i == j || i + j == (2 * num)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}


