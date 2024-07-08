package com.upaio.democodecov.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UtilityController.class)
class UtilityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testMergeStrings() throws Exception {
        mockMvc.perform(get("/api/utility/mergeStrings")
                .param("first", "hello")
                .param("second", "world"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello world"));
    }

    @Test
    void testIsPalindrome() throws Exception {
        mockMvc.perform(get("/api/utility/isPalindrome/madam"))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }

    @Test
    void testFactorial() throws Exception {
        mockMvc.perform(get("/api/utility/factorial/5"))
                .andExpect(status().isOk())
                .andExpect(content().string("120"));
    }

    @Test
    void testFindMax() throws Exception {
        mockMvc.perform(post("/api/utility/findMax")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[1,2,5,3]"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

    @Test
    void testSplitWords() throws Exception {
        mockMvc.perform(get("/api/utility/splitWords")
                .param("sentence", "hello world"))
                .andExpect(status().isOk())
                .andExpect(content().json("[\"hello\",\"world\"]"));
    }

    @Test
    void testSumArray() throws Exception {
        mockMvc.perform(post("/api/utility/sumArray")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[1,2,3,4]"))
                .andExpect(status().isOk())
                .andExpect(content().string("10"));
    }

    @Test
    void testToUpperCase() throws Exception {
        mockMvc.perform(post("/api/utility/toUpperCase")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[\"hello\",\"world\"]"))
                .andExpect(status().isOk())
                .andExpect(content().json("[\"HELLO\",\"WORLD\"]"));
    }

    @Test
    void testIsPrime() throws Exception {
        mockMvc.perform(get("/api/utility/isPrime/5"))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }

}
