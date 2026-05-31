package ArraysAndHashing;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] freq = new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        for(char d:t.toCharArray())
        {
            freq[d-'a']--;
            if(freq[d-'a']<0) return false;
        }
        return true;
    }
}
