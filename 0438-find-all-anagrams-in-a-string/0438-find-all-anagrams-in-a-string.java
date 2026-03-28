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
        Map<Character,Integer> map1=new HashMap<>();
        while(j<n)
        {
            map1.put(s.charAt(j),map1.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1==k)
            {
                if(map.equals(map1))
                list.add(i);
                char ch=s.charAt(i);
                if(map1.containsKey(ch))
                {
                    int freq=map1.get(ch)-1;
                    if(freq==0)
                    map1.remove(ch);
                    else
                    map1.put(ch,freq);
                }
                i++;
            }
            j++;
        }
        return list;
    }
}