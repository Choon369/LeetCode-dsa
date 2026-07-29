class Solution {
    public boolean isHappy(int n) {
        
        boolean ret =false;
        HashSet<Integer> s = new HashSet<>();
        if(n ==1)
            ret = true;
        while(n !=1)
        {
            int sum =0;
            
            while(n>0)
            {
                int t = n%10;
                sum = sum + (int) Math.pow(t,2);
                n = n/10;

                
            }
            if(sum == 1)
            {
                ret = true;
                break;
            }
            if(s.contains(sum))
            {
                ret = false;
                break;
            }
            s.add(sum);
            n = sum;
        }
        return ret;
    }
}
