class Solution {
    public String reverseWords1(String s1)
    {
        String s2=new StringBuilder(s1).reverse().toString();
        return s2;
    }
    public String reverseWords(String s) {
        StringBuilder s3=new StringBuilder();
        int i=0;
        int j=0;
        int n=s.length();
        while(j<n)
        {
            char ch=s.charAt(j);
            if(ch==' ')
            {
            String temp=s.substring(i,j);
            s3.append(reverseWords1(temp));
            s3.append(" ");
            i=j+1;
            }
            j++;

        }
        String temp = s.substring(i, j);
        s3.append(reverseWords1(temp));

        return s3.toString();
    }
}