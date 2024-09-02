import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int len=arr.length;
        System.out.println("Original Array: " + Arrays.toString(arr));
        for(int i=0;i<len/2;i++){
            int temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
