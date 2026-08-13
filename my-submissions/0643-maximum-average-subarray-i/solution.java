class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wind_Start=0;
        double max_avrge =0;
        double avg =0.0;
        int sum =0;
        for(int i =0 ;i<k;i++)
        {
            sum += nums[i]; 
        }
        max_avrge = (double) sum/k;
        for(int i =k;i<nums.length;i++)
        {
            sum += nums[i] -nums[i-k]; 
            avg = (double)sum/k;
            max_avrge = Math.max(max_avrge,avg);
        }
        return max_avrge;
    }
}
