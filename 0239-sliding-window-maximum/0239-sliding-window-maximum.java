class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        int i=0;
        int j=0;
        int index=-1;
        int ind=0;
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        while(j<n)
        {
            if(nums[j]>fmax)
            {
                smax=fmax;
                fmax=nums[j];
                index=j;
            }
            else if(nums[j]>smax&&nums[j]!=fmax)
            {
                smax=nums[j];
            }
           
           if(j-i+1==k)
           {
              arr[ind++]=fmax;
              if(i==index)
              {
                fmax=smax;
              }
              i++;
           }
           j++;

        }
        return arr;
    }
}