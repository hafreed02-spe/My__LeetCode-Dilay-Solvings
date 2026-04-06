class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size(); 
        int left = 0, right = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        while (right < s.length()) {
            char ch = s.charAt(right);

            // acquire
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    count--; 
                }
            }

            right++;


            while (count == 0) {
                
                if (right - left < min) {
                    min = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count++; 
                    }
                }

                left++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}