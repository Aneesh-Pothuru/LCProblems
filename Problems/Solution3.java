import java.util.*;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int counter = 0;
        int start = 0;
        int max = 0;
        while (start < s.length() && counter < s.length()) {
            if (!hs.contains(s.charAt(counter))) {
                hs.add(s.charAt(counter));
                counter++;
                max = Math.max(max, counter - start);
            } else {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
