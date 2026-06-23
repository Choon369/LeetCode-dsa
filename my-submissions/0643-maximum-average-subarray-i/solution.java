class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg = 0.0;
        double avg =0.0;
        int winsum =0;
        for(int i = 0;i<k;i++)
        {
            winsum = winsum +nums[i];
        }
        maxavg = (double) winsum/k;

        for(int j = k;j<nums.length;j++)
        {
            winsum += nums[j] - nums[j-k];
            avg = (double) winsum/k;
            maxavg = Math.max(maxavg,avg);
        }
        return maxavg;
    }
}
