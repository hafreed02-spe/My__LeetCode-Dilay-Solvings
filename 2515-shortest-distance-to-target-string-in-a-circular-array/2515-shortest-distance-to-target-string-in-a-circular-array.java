class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(target.equals(words[i]))
            {
                int d=Math.abs(i-startIndex);
                int dd=Math.min(d,n-d);
                min=Math.min(min,dd);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}