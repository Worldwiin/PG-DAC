public class Third_Largest_Element_Array {
    public static int findThirdLargest() {
        int[] arr = {4, 11, 2, 35, 33, 59, 52, 45, 51};


        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest && arr[i] != largest && arr[i] != secondLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        int thirdLargest = findThirdLargest();
        System.out.println("The third largest element is: " + thirdLargest);
    }
}
