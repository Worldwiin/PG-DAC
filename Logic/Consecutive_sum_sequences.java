import java.util.ArrayList;
import java.util.List;

public class Consecutive_sum_sequences {

    public static List<List<Integer>> findConsecutiveSequences(int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        // Start loop from 1 to targetSum / 2 (as sequences won't be longer than this)
        for (int start = 1; start <= targetSum / 2; start++) {
            List<Integer> sequence = new ArrayList<>();
            int sum = 0;
            int number = start;

            // Add consecutive numbers until the sum reaches or exceeds targetSum
            while (sum < targetSum) {
                sum += number;
                sequence.add(number);
                number++;
            }

            // If the exact sum is reached, add the sequence to result
            if (sum == targetSum) {
                result.add(new ArrayList<>(sequence));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int targetSum = 25;

        // Get the sequences
        List<List<Integer>> sequences = findConsecutiveSequences(targetSum);

        // Print the number of sequences
        System.out.println("Number of sequences: " + sequences.size());

        // Print each sequence
        for (List<Integer> sequence : sequences) {
            System.out.println(sequence);
        }
    }
}