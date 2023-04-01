package me.imatveev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringLengthTest {

    @Test
    void test01() {
        String source = "abcabcbb";

        assertEquals(3, LongestSubstringLength.lengthOfLongestSubstring(source));
    }

    @Test
    void test02() {
        String source = "bbbbb";

        assertEquals(1, LongestSubstringLength.lengthOfLongestSubstring(source));
    }

    @Test
    void test03() {
        String source = "pwwkew";

        assertEquals(3, LongestSubstringLength.lengthOfLongestSubstring(source));
    }

    @Test
    void test04() {
        String source = " ";

        assertEquals(1, LongestSubstringLength.lengthOfLongestSubstring(source));
    }
    @Test
    void test05() {
        String source = "abba";

        assertEquals(2, LongestSubstringLength.lengthOfLongestSubstring(source));
    }
}