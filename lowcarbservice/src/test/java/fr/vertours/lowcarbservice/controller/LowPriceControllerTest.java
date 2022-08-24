package fr.vertours.lowcarbservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class
LowPriceControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void getLatestPrice() throws Exception {
        double expected = 0;

        mvc.perform(get("/api/LowCarbService"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price", is(expected)))
        ;
    }
}