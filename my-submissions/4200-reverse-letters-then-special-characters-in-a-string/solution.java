class Solution {
    public String reverseByType(String s) {
        char[] chr = s.toCharArray();
        int len = s.length();
        char[] x = new char[len];
        char[] y = new char[len];
        int n =0;
        int m=0;
        
        for(int i =len-1;i>=0;i--)
        {
            if(Character.isLetterOrDigit(chr[i]))
            {
                x[m] = chr[i];
                m++;
            }
            else
            {
                y[n]=chr[i];
                n++;
            }
        }
        m=0;
        n=0;
        for(int i =0;i<len;i++)
        {
            if(Character.isLetterOrDigit(chr[i]))
            {
                chr[i] =x[m];
                m++;
            }
            else
            {
                chr[i]=y[n];
                n++;
            }
        }
        String st = new String(chr);
        return st;
    }
}
