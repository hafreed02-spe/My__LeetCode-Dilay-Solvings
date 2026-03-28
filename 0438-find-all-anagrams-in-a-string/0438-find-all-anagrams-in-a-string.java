class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
        int i=0;
        int j=0;
        int n=s.length();
        List<Integer> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:p.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=map.size();
        while(j<n)
        {
           char ch=s.charAt(j);
           if(map.containsKey(ch))
           {
            int freq=map.get(ch)-1;
            map.put(ch,freq);
            if(freq==0)
            count--;
           }
           if(j-i+1==k)
           {
             if(count==0)
             list.add(i);
             char ch1=s.charAt(i);
           if(map.containsKey(ch1))
           {
            map.put(ch1,map.get(ch1)+1);
            if(map.get(ch1)==1)
            count++;
           }
           i++;
           }
           j++;
           
        }
        return list;
    }
}