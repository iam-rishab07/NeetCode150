package SlidingWindow;

// longest substring without repeating characters
import java.util.*;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // edge cases
        if(s.isEmpty()) return 0;
        if(s.length()==1) return 1;

        int left = 0, ans = 0;
        Set<Character> charSet = new HashSet<>();
        for(int right = 0;right<s.length();right++)
        {
            while(charSet.contains(s.charAt(right)))
            {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
