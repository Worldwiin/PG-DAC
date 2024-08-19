public class Duplicates_in_array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 5, 5, 2, 3, 2, 8, 8, 9};
        int len = arr.length;
        boolean[] isDuplicate = new boolean[len];

        for (int i = 0; i < len; i++) {
            if (isDuplicate[i]) {
                continue;
            }
            boolean foundDuplicate = false;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    foundDuplicate = true;
                    isDuplicate[j] = true;
                }
            }

            if (foundDuplicate) {
                System.out.println("There are duplicates of " + arr[i]);
            }
        }
    }
}

/*
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        for (int duplicate : duplicates) {
            System.out.println("There are duplicates of " + duplicate);
        }
*/
