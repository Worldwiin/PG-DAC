public class Recursive_Print_Numbers {
    public static void main(String[] args) {
        int no = 5;
        call(no);
    }

    static void call(int no) {
        if (no == 0)
            return;
        no--;
        System.out.println(no);
        call(no);
    }
}