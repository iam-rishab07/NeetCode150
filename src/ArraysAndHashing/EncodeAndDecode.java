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
}