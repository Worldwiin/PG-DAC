import java.util.Scanner;

public class Occurence_binary_one
{
    public static void main(String [] args){
        System.out.println("Enter binary number representation: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] arr = s.toCharArray();
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]=='1'){
                count++;

            }
        }
        System.out.println(count);
    }
}
