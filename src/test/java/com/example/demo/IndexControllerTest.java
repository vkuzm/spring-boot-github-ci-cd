package com.example.demo;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class IndexControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test1() throws Exception {
        mockMvc.perform(get("/"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello World")));
    }

    @Test
    void test2() throws Exception {
        mockMvc.perform(get("/"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello World")));
    }

    @Test
    void test3() throws Exception {
        mockMvc.perform(get("/"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello World")));
    }

    @Test
    void test4() throws Exception {
        mockMvc.perform(get("/"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello World")));
    }

    @Test
    void test5() throws Exception {
        mockMvc.perform(get("/"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello World")));
    }
}