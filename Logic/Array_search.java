import java.util.Scanner;

public class Array_search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the number to search in the array: ");
        int number = scanner.nextInt();
        int [] arr={10,20,30,40,50,60,70,80,90};
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
               flag = true;
            }
        }
        if(flag){
            System.out.println(number+" is found");
        }
    }
}


