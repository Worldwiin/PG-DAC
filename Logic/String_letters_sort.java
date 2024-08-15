public class String_letters_sort {
    public static void main(String[] args) {
        String s1 = "helloworld";
        char [] str=s1.toCharArray();
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-1;j++){
                if(str[j]>str[j+1]){
                    char temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;

                }
            }
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }

    }
}
