class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> lets = new HashMap<>();
        int left =0;
        int max_len =0;
        boolean ret =false;
        for(int right =0;right <nums.length;right++)
        {
            if(lets.containsKey(nums[right]))
            {
                int diff = right-lets.get(nums[right]);
                if(diff<=k)
                {
                    ret = true;
                }
                lets.replace(nums[right],right);
            }
            else
            {
                lets.put(nums[right],right);
            }

        }
        return ret;
        
    }
}
