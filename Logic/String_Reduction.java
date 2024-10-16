public class String_Reduction
{
    public static void main(String args[])
    {
        String data="aaaaabbbbcccdd";
        int count,i,j;
        for(i=0;i<data.length()-1;)
        {
            count=1;
            for(j=i+1;j<data.length() && data.charAt(i)==data.charAt(j);j++)
            {
                count++;
            }
            if(count>1)
                System.out.print(data.charAt(i)+""+count);
            else
                System.out.print(data.charAt(i));
            i=j;
        }
    }
}

/*
Output: a5b4c3d2
 */
