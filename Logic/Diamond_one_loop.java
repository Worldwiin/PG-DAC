public class Diamond_one_loop {
    public static void main(String[] args) {
        int rows = 5;

        // Regular pyramid
        for (int i = 1; i <= rows; i++) {
            String spaces = " ".repeat(rows - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }

        // Inverted pyramid
        for (int i = rows - 1; i >= 1; i--) {
            String spaces = " ".repeat(rows - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
    }
}
