import java.util.Scanner;

public class SwapAdjacent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[4];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        swapAdjacent(arr);
    }
    public static void swapAdjacent(int[] arr){
       for(int i=0;i<arr.length;i+=2){
           for(int j=i+1;j<i+2;j++){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
       }
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
}

//10 20 30 40
//20 10 40 30