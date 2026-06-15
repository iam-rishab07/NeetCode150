package SlidingWindow;

// Longest Repeating Character Replacement
public class LongestRepeating {
    public int characterReplacement(String s, int k) {
        if(s.isEmpty()) return 0;  // edge case
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0, maxWindow = 0;
        for(int right = 0;right<s.length();right++)
        {
            // update frequency of current character
            freq[s.charAt(right)-'A']++;

            // update max Freq
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);
            int windowLength = right - left + 1;

            // check if windowLength - maxFreq > k, shrink window
            if(windowLength - maxFreq > k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxWindow = Math.max(maxWindow,right - left + 1);
        }
        return maxWindow;
    }
}
