/*
 * Copyright (c) 2024.
 * Computer and Technology Consulting, Inc.
 * All Rights reserved.
 */

package com.compucafe.sbd.web;

import com.compucafe.sbd.service.AccountService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MainController.class)
class MainControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    AccountService accountService;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getHello() throws Exception {
        this.mockMvc.perform(get("/hello").param("name", "John"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello")));

//        Object x = this.restTemplate.getForObject("http://localhost:" + port + "/hello", String.class);
//        System.err.println(String.format("x is %s", x.getClass().getName()));
//        assertThat(this.restTemplate
//                .getForObject("http://localhost:" + port + "/hello",String.class))
//                .contains("Hello");

    }

    @Test
    void getAccount() {
    }
}