public class Alternate_word_replace {
    public static void main(String[] args) {
        String a = "Virat.is.good.batsman";
        String word = "";
        String finalStr = "";
        int wordCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '.') {
                word += a.charAt(i);
            } else {
                if (wordCount % 2 == 0) {
                    finalStr += word + ".";
                } else {
                    finalStr += "xyz.";
                }
                word = "";
                wordCount++;
            }
        }
        if (wordCount % 2 == 0) {
            finalStr += word;
        } else {
            finalStr += "xyz";
        }

        System.out.println(finalStr);
    }
}
//Op: Virat.xyz.good.xyz.

//         String str="Virat.is.good.batsman.";
//        String[] arr=str.split("\\.");
//        String replace="xyz";
////        System.out.println(arr.length);
//        for(int i=1;i<=arr.length;i+=2){
//            arr[i]=replace;
//        }
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+".");
//        }


