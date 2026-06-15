package ArraysAndHashing;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums)
    {
        int longest = 0;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,Boolean.FALSE);
        }
        for(int num:nums)
        {
            int length = 1;

            //next number
            int nextNum = num+1;
            while(map.containsKey(nextNum) && map.get(nextNum)==Boolean.FALSE)
            {
                length++;
                map.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            //prev number
            int prevNum = num-1;
            while(map.containsKey(prevNum) && map.get(prevNum)==Boolean.FALSE)
            {
                length++;
                map.put(nextNum,Boolean.TRUE);
                prevNum--;
            }
            longest = Math.max(longest,length);
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,8,10,2,3,6,12};
        int res = longestConsecutive(arr);
        System.out.println("The length of longest consecutive sequence is "+res);
    }
}
