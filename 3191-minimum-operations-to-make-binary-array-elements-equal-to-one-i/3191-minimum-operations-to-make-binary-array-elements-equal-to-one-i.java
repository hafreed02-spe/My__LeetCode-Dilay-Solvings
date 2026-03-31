class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int n=nums.length;
        int i=0;
        while(i+2<n)
        {
            if(nums[i]==1)
            {
                i++;
                continue;
            }
            else
            {
                count++;
                nums[i+1]=(nums[i+1]==1)?0:1;
                 nums[i+2]=(nums[i+2]==1)?0:1;
                 i++;
            }
        }
        if(nums[n-1]==0||nums[n-2]==0)
        return -1;
        return count;

        
    }
}