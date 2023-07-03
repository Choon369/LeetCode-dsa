class Solution {
    public String countAndSay(int n) {
        int counter=0;
        if(n==1) return "1";
        String s= countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            counter++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))
            {
                sb= sb.append(counter).append(s.charAt(i));
                counter =0;
            }
        }
        return sb.toString();
    }
}
