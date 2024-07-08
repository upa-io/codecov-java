package com.upaio.democodecov.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedUtility {
    
    private AdvancedUtility() {
        // private constructor to hide the implicit public one
    }

     // Concatenates two strings with a space in between
    public static String mergeStrings(String first, String second) {
        return first + " " + second;
    }

    // Checks if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Calculates the factorial of a number
    public static long factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    // Finds the maximum number in an array
    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
    }

    // Splits a string by spaces and returns a list of words
    public static List<String> splitWords(String sentence) {
        return Arrays.asList(sentence.split("\\s+"));
    }

    // Calculates the sum of an array of numbers
    public static int sumArray(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    // Converts a list of strings to uppercase
    public static List<String> toUpperCase(List<String> words) {
        return words.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    // Checks if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
