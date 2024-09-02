public class Sliding_window {
    static void min_max_window(int[] data, int window_size) {
        for (int front = 0, rear = window_size - 1; rear <= data.length - 1; front++, rear++) {
            int min, max;
            min = max = data[front];
            for (int i = front; i <= rear; i++) {
                if (data[i] < min)
                    min = data[i];
                else if (data[i] > max)
                    max = data[i];
            }
            System.out.println("Window [" + (front + 1) + " - " + (rear + 1) + "]: Min = " + min + ", Max = " + max);
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 3, 12, 50, 40, 15, 60, 1};
        int window_size = 4;
        min_max_window(data, window_size);
    }
}
/*
Window [1 - 4]: Min = 3, Max = 50
Window [2 - 5]: Min = 3, Max = 50
Window [3 - 6]: Min = 12, Max = 50
Window [4 - 7]: Min = 15, Max = 60
Window [5 - 8]: Min = 1, Max = 60
 */