package com.upaio.democodecov.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AdvancedUtilityTest {
    @Test
    void testMergeStrings() {
        assertEquals("hello world", AdvancedUtility.mergeStrings("hello", "world"));
        assertEquals("hello ", AdvancedUtility.mergeStrings("hello", ""));
        assertEquals(" world", AdvancedUtility.mergeStrings("", "world"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(AdvancedUtility.isPalindrome("madam"));
        assertFalse(AdvancedUtility.isPalindrome("java"));
        assertTrue(AdvancedUtility.isPalindrome(""));
    }

    @Test
    void testFactorial() {
        assertEquals(120, AdvancedUtility.factorial(5));
        assertEquals(1, AdvancedUtility.factorial(0));
        assertEquals(1, AdvancedUtility.factorial(1));
    }

    @Test
    void testFindMax() {
        assertEquals(5, AdvancedUtility.findMax(new int[]{1, 2, 5, 3}));
        assertEquals(-1, AdvancedUtility.findMax(new int[]{-1}));
        assertEquals(Integer.MIN_VALUE, AdvancedUtility.findMax(new int[]{}));
    }

    @Test
    void testSplitWords() {
        assertEquals(Arrays.asList("hello", "world"), AdvancedUtility.splitWords("hello world"));
        assertEquals(Arrays.asList("hello"), AdvancedUtility.splitWords("hello"));
        assertEquals(Arrays.asList(""), AdvancedUtility.splitWords(""));
    }

    @Test
    void testSumArray() {
        assertEquals(10, AdvancedUtility.sumArray(new int[]{1, 2, 3, 4}));
        assertEquals(-1, AdvancedUtility.sumArray(new int[]{-1}));
        assertEquals(0, AdvancedUtility.sumArray(new int[]{}));
    }

    @Test
    void testToUpperCase() {
        assertEquals(Arrays.asList("HELLO", "WORLD"), AdvancedUtility.toUpperCase(Arrays.asList("hello", "world")));
        assertEquals(Arrays.asList("JAVA"), AdvancedUtility.toUpperCase(Arrays.asList("java")));
        assertEquals(Arrays.asList(), AdvancedUtility.toUpperCase(Arrays.asList()));
    }

    @Test
    void testIsPrime() {
        assertTrue(AdvancedUtility.isPrime(5));
        assertFalse(AdvancedUtility.isPrime(4));
        assertFalse(AdvancedUtility.isPrime(1));
        assertFalse(AdvancedUtility.isPrime(0));
    }

}
