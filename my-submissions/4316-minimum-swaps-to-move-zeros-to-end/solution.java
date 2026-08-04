class Solution {
    public int minimumSwaps(int[] nums) {
        int i =0;
        int j = nums.length-1;
        int c=0;
        while(i<j)
        {
            int t =0;
            if(nums[i]==0 && nums[j]!= 0)
            {
                t = nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                c++;
            }
            if(nums[i] !=0)
            {
                i++;
            }
            if(nums[j]==0)
            {
                j--;
            }
            

        }
        return c;
    }
}
