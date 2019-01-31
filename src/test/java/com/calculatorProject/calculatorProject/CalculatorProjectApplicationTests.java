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
	public void addTest(){
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.addTwoNumbers("23333333333333", "3"), "23333333333336");
		Assert.assertEquals(calculator.addTwoNumbers("dos", "tres"), "Invalid input");
	}

	@Test
	public void responseStructureTest() {
		CalculatorOperationResponse response = new CalculatorOperationResponse();
		Map<String, String> map = new HashMap<>();
		map.put("500", "Internal Server Error");
	}
}

