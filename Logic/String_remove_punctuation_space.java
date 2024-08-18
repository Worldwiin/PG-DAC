public class String_remove_punctuation_space {
    public static void main(String[] args) {
        String str="Hello World. Lets Go!. $HODL";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9'){
                sb.append(ch);
            }
        }
        String result=sb.toString();
        System.out.println("Result: "+result);


    }
}
