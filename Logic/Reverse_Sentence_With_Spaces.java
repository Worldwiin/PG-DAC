public class Reverse_Sentence_With_Spaces {
    public static void main(String[] args) {
        String original = "Pulp Fiction";
        String reversed = reverseString(original);

        System.out.println("Original: [" + original + "]");
        System.out.println("Reversed: [" + reversed + "]");
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
/*
o/p:
Original: [Pulp Fiction]
Reversed: [noitciF pluP]
 */