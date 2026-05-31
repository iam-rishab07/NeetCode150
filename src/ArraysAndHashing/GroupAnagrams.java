package ArraysAndHashing;

import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs)
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            if(!map.containsKey(newWord))
            {
                map.put(newWord,new ArrayList<>());
            }
            map.get(newWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
