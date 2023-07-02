class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            if((nums[i]==nums[i+1]) && (nums[i]<=(n-1)))
            {
                ans= nums[i];
                break;
            }
        }
        return ans;
    }
}
