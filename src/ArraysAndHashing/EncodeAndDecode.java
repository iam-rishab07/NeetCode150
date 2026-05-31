package ArraysAndHashing;

import java.util.*;

public class EncodeAndDecode {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // Append length, the delimiter '#', and the string itself
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return result;
        }

        int i = 0;
        while (i < s.length()) {
            // Find the position of the next hash character
            int hashPos = s.indexOf('#', i);

            // Extract the length of the upcoming string
            int length = Integer.parseInt(s.substring(i, hashPos));

            // Move index past the '#' sign
            i = hashPos + 1;

            // Extract the string chunk based on the parsed length
            String str = s.substring(i, i + length);
            result.add(str);

            // Move pointer to the start of the next length block
            i += length;
        }
        return result;
    }

    public static class GroupAnagrams {
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
}