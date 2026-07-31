class Solution {
    public String reverseWords(String s) {
        //char[] a = s.toCharArray();
        String[] str = s.split(" ");
        int n = str.length;
        String[] fin = new String[n];
        for(int x =0;x<n;x++)
        {
            char[] a = str[x].toCharArray();
            int i=0;
            int j =a.length-1;
            while(i<=j)
            {
                char t = a[i];
                a[i]= a[j];
                a[j] =t;
                i++;
                j--;
            }
            String temp = new String(a);
            fin[x]=temp;
        }
        
        String ret =  String.join(" ",fin);
        return ret;
    }
}
