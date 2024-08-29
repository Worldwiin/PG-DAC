public class Alternate_word_replace {
    public static void main (String [] args){
        String str="Virat.is.good.batsman.";
        String[] arr=str.split("\\.");
        String replace="xyz";
//        System.out.println(arr.length);
        for(int i=1;i<=arr.length;i+=2){
            arr[i]=replace;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+".");
        }
    }
}
//Op: Virat.xyz.good.xyz.
