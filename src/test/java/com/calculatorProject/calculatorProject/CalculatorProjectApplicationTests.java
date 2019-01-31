package com.calculatorProject.calculatorProject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorProjectApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.operate("23333333333333", "3", "add"), "23333333333336");
        Assert.assertEquals(calculator.operate("dos", "tres", "add"), "Invalid input");
        Assert.assertEquals(calculator.operate("2", "3", "other"), "Wrong operation");
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.operate("5", "3", "subtract"), "2");
        Assert.assertEquals(calculator.operate("3", "6", "subtract"), "-3");
        Assert.assertEquals(calculator.operate("2", "3", "other"), "Wrong operation");
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.operate("3", "3", "multiply"), "9");
        Assert.assertEquals(calculator.operate("dos", "tres", "multiply"), "Invalid input");
        Assert.assertEquals(calculator.operate("2", "3", "other"), "Wrong operation");
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.operate("8", "4", "divide"), "2");
        Assert.assertEquals(calculator.operate("dos", "tres", "divide"), "Invalid input");
        Assert.assertEquals(calculator.operate("2", "3", "other"), "Wrong operation");
    }

    @Test
    public void responseStructureTest() {
        CalculatorOperationResponse response = new CalculatorOperationResponse();
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(500, "Internal Server Error");
        response.setError(map);
        response.setData("45");
    }

    @Test
    public void addManyNumbersTest() {
        Calculator calculator = new Calculator();
//		Assert.assertEquals(calculator.calculate("2+8+1"), "");
    }
}

