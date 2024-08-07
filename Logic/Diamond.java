public class Diamond {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++) {
            for(int s=1;s<=3-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int r = i-1; r>=1; r--) {
                System.out.print(r);
            }
            System.out.println();
        }
        //Same code as above except the outer for loop
        for(int i=2;i>=1;i--) {
            for(int s=1;s<=3-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int r = i-1; r>=1; r--) {
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
