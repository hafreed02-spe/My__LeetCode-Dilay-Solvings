class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n=s.length();
        int i=0;
        int j=0;
        Set<Character> set=new HashSet<>();
        while(j<n)
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                max=Math.max(max,j-i+1);
                j++;
            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}