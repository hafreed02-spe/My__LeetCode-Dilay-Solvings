class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        int i=0;
        int j=0;
        int index=-1;
        int ind=0;
        int fmax=Integer.MIN_VALUE;
        while(j<n)
        {
            if(nums[j]>fmax)
            {
                fmax=nums[j];
                index=j;
            }
            if(j-i+1==k)
            {
                arr[ind++]=fmax;
                if(index==i)
                {
                    fmax=Integer.MIN_VALUE;
                    for(int l=i+1;l<=j;l++)
                    {
                        if(nums[l]>fmax)
                        {
                            fmax=nums[l];
                            index=l;
                        }
                    }  
                }
                i++;
            }
            j++;

        }
        return arr;
    }
}