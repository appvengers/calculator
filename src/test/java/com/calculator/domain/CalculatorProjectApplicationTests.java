package com.calculator.domain;


import org.junit.Assert;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorProjectApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Before
    public void beforeEachTestMethod() {
        System.out.println("Invoked before each test method");
    }

//    @Test
//    public void addTwoNumbersTest() {
//        Calculator calculator = new Calculator();
//        Assert.assertEquals("8", calculator.operate("5", "3", "add").getData().get("result"));
//    }

    @Test
    public void testInnerClass() {
        CalculatorOperationResponse calresponse = new CalculatorOperationResponse(true,
            new ErrorResponse("30", "Error Prueba"),
            new ResultResponse("33333"));

        System.out.println("clase " + calresponse.toString());

    }

}

