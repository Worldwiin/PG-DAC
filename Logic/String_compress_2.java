public class String_compress_2
{
    public static void main(String [] args)
    {
        String data = "aaabbbaabababaccc";
        int[] count = new int[26];

        for (int i = 0; i < data.length(); i++) {
            count[data.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.print((char) (i + 'a') + "" + count[i]);
            }
        }
    }
}

//Input: aaabbbaabababaccc
//Output: a8b6c3
