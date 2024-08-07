import java.util.Scanner;

public class Word_occurence_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word ");
        String word = sc.nextLine();
        String[] words = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)){
                count++;
            }
        }
        System.out.println("The word: "+word+" has occured "+count+ " times");
    }
}
