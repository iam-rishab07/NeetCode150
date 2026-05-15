package Strings;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        if(strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String word:strs)
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord))
            {
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
