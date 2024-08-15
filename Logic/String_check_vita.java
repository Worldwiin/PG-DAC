import java.util.Scanner;

public class String_check_vita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String target = "vita";
        String[] carr = str.split(" ");
        int cnt1 = 0;

        for (int i = 0; i < carr.length; i++) {
            if (carr[i].toLowerCase().contains(target)) {
                cnt1++;
            }
        }

        System.out.println("VITA: " + cnt1);
    }
}
