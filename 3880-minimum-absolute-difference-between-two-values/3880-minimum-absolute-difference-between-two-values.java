class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
            {
                if(nums[i]==1)
                {
                for(int j=0;j<n;j++)
                    {
                       if(nums[j]==2)
                           min=Math.min(min,Math.abs(i-j));
                    }
                }
            }
        if(min==Integer.MAX_VALUE)
            return -1;
        return min;
    }
}