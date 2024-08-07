public class Fibo_recursive {
    static int x=0,y=1;
    public static void main(String[] args) {
        System.out.print(x+" "+y+" ");
        fibo(5);
    }
    static void fibo(int n) {
        int c;
        c=x+y;
        System.out.print(c+" ");
        x=y;
        y=c;
        n--;
        if(n>2){
            fibo(n);
        }
    }
}
