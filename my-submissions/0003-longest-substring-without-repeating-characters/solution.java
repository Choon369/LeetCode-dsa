class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> done = new HashSet<>();
        int max_length =0;
        int len = s.length();
        int left =0;

        for(int right =0;right<len;right++)
        {
            while(done.contains(s.charAt(right)))
            {
                done.remove(s.charAt(left));
                left++;
            }
            //else
            //{
                done.add(s.charAt(right));
                max_length = Math.max(max_length,right-left+1);
            //}

        }
        return max_length;
    }
}
