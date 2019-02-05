package com.calculator.domain;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTests {



    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CalculatorController calculatorController;



    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(calculatorController)
                .build();
    }

    //this method is to test a post endpoint
    @Test
    public void testPostController() throws Exception {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String calculatorJson = ow.writeValueAsString(new Calculator("1", "2", "add"));

        MockHttpServletResponse response = mockMvc.perform(
                post("http://localhost:8080/services/operations/V1")
                        .contentType(MediaType.APPLICATION_JSON).content(calculatorJson))
                            .andReturn().getResponse();

        Assert.assertEquals(response.getStatus(), HttpStatus.OK.value());
    }

}
