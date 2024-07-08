package com.upaio.democodecov.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upaio.democodecov.utils.AdvancedUtility;

@RestController
@RequestMapping("/api/utility")
public class UtilityController {

    @GetMapping("/mergeStrings")
    public String mergeStrings(@RequestParam String first, @RequestParam String second) {
        return AdvancedUtility.mergeStrings(first, second);
    }

    @GetMapping("/isPalindrome/{input}")
    public boolean isPalindrome(@PathVariable String input) {
        return AdvancedUtility.isPalindrome(input);
    }

    @GetMapping("/factorial/{number}")
    public long factorial(@PathVariable int number) {
        return AdvancedUtility.factorial(number);
    }

    @PostMapping("/findMax")
    public int findMax(@RequestBody int[] numbers) {
        return AdvancedUtility.findMax(numbers);
    }

    @GetMapping("/splitWords")
    public List<String> splitWords(@RequestParam String sentence) {
        return AdvancedUtility.splitWords(sentence);
    }

    @PostMapping("/sumArray")
    public int sumArray(@RequestBody int[] numbers) {
        return AdvancedUtility.sumArray(numbers);
    }

    @PostMapping("/toUpperCase")
    public List<String> toUpperCase(@RequestBody List<String> words) {
        return AdvancedUtility.toUpperCase(words);
    }

    @GetMapping("/isPrime/{number}")
    public boolean isPrime(@PathVariable int number) {
        return AdvancedUtility.isPrime(number);
    }
}
