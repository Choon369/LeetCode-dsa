class Solution {
    public boolean judgeSquareSum(int c) {
        int j = (int)Math.sqrt(c);
        int i=0;
        
        while(i<=j)
        {
            long sum =0;
            sum = (long)(Math.pow(i,2) +Math.pow(j,2));
            if(sum <c)
            {
                i++;
            }
            else if(sum>c)
            {
                j--;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
