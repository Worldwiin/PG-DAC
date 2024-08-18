public class Swap_without_third_variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap: " + "A= "+a+ " and " +" B= "+ b);
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println("After swap: " + "A= "+a+ " and " +" B= "+ b);
    }
}
