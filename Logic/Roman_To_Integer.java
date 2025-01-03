import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_To_Integer {
    public static int romanToInt(String roman) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine();
        int result = romanToInt(roman);
        System.out.println("The integer value for Roman numeral " + roman +" is: " + result);

    }
}
/*
o/p:
Enter a Roman numeral: XII
The integer value for Roman numeral XII is: 12
 */