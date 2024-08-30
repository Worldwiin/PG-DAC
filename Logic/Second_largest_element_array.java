public class Second_largest_element_array {
    public static int findLargest() {
        int[] arr = {4, 11, 2, 35, 33,59, 52, 45, 51};
        int largest=0;
        int secondLargest=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int secondLargest = findLargest();
        System.out.println("The second largest element is: " + secondLargest);
    }
}