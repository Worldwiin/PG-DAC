public class Pattern_fibo {
    public static void main(String[] args) {
int n1=0,n2=1,n3=0;
for(int i=1;i<=3;i++) {
    for (int j = 1; j <= i; j++) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(n3);
    }
    System.out.println();
}

    }
}