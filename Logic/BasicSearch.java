import java.util.Scanner;

public class BasicSearch {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
            }
        }
        if(flag){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
