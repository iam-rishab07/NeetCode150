package SlidingWindow;

// minimum window substring
public class MinWindowSub {
    public String minWindow(String s, String t) {
        if(t.length()>s.length() || s.isEmpty() || t.isEmpty()) return "";

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for(char c : t.toCharArray()) mapT[c]++;
        int right = 0, left = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        for(; right<s.length();right++)
        {
            mapS[s.charAt(right)]++;
            while(contains(mapS,mapT))
            {
                if(right-left+1<minLen)
                {
                    minLen = right-left+1;
                    minStart = left;
                }
                mapS[s.charAt(left++)]--;
            }
        }
        return minLen==Integer.MAX_VALUE? "":s.substring(minStart,minStart+minLen);
    }

    public boolean contains(int[] mapS,int[] mapT)
    {
        for(int i=0;i<256;i++)
        {
            if(mapT[i]>mapS[i])
            {
                return false;
            }
        }
        return true;
    }
}
