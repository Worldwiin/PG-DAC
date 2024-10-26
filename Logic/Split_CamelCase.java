public class Split_CamelCase {
    public static void main(String[] args) {
        String input = "ILovePulpFiction";
        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append("\n");
            }
            result.append(input.charAt(i));
        }
        System.out.println(result.toString());
    }
}

/*
O/p:
I
Love
Pulp
Fiction
 */