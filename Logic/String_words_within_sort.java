public class String_words_within_sort {
    public static void main(String[] args) {
        String s1 = "HELLO WORLD";
        String[] words = s1.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            char[] str = word.toCharArray();
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str.length - 1; j++) {
                    if (str[j] > str[j + 1]) {
                        char temp = str[j];
                        str[j] = str[j + 1];
                        str[j + 1] = temp;
                    }
                }
            }
            //sortedString.append(new String(str)).append(" ");
            String sortedWord = new String(str);
            sb.append(sortedWord);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
//o/p: EHLLO DLORW