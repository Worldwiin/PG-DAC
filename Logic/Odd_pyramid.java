public class Odd_pyramid {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i*2-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
1
123
12345
1234567
123456789
*/