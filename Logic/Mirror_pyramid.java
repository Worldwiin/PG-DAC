public class Mirror_pyramid {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
