class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int sum=0;
        while(i<j)
        {
            int locsum = Math.min(height[i],height[j]) * (j-i);
            if(locsum>sum)
            {
                sum = locsum;
            }
            if(height[i]>height[j])
            {
                j--;
            }
            else if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }

        }
        return sum;
        
    }
}
