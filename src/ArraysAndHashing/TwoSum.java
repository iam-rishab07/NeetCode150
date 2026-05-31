package ArraysAndHashing; // leetCode 1

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement),i};
            else
                map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

    public static class ValidAnagram {
    //    public boolean isAnagram(String s, String t) { // Approach 1
    //        if(s.length()!=t.length()) return false;
    //
    //        int[] freq = new int[26];
    //        for(int i=0;i<s.length();i++)
    //        {
    //            freq[s.charAt(i)-'a']++;
    //            freq[t.charAt(i)-'a']--;
    //        }
    //        for(int num:freq)
    //        {
    //            if(num!=0) return false;
    //        }
    //        return true;
    //    }

        public boolean isAnagram(String s, String t) { // Appraoch 2 (Better Version)
            if(s.length()!=t.length()) return false;
            int[] freq = new int[26];
            for(char c : s.toCharArray())
            {
                freq[c-'a']++;
            }
            for(char c : t.toCharArray())
            {
                freq[c-'a']--;
                if(freq[c-'a']<0) return false;
            }
            return true;
        }
    }
}
