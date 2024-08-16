public class Word_and_sentences_count {
    public static void main(String[] args) {
        String str="The dog wags his tail. I think he is happy.";
        String [] words=str.split(" ");
        String [] sentences=str.split(" . ");
        int words_count=words.length;
        int sentences_count=sentences.length;
        System.out.println("The number of words in the sentence are: "+words_count);
        System.out.println("The number of sentences are: "+sentences_count);
    }
}
