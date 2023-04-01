package me.imatveev;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String source) {
        final Map<Character, Integer> charMap = new HashMap<>();

        int start = 0;
        int length = 0;

        for (int current = 0; current < source.length(); ++current) {
            final char key = source.charAt(current);
            final Integer prevPosition = charMap.get(key);

            if (prevPosition != null && prevPosition >= start) {
                start = prevPosition + 1;
            }
            charMap.put(key, current);

            length = Math.max(length, current - start + 1);
        }

        return length;
    }
}
