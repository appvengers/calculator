package com.calculatorProject.calculatorProject;

import org.junit.Assert;
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

	@Test
	public void addTest(){
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.addTwoNumbers("23333333333333", "3"), "23333333333336");
		Assert.assertEquals(calculator.addTwoNumbers("dos", "tres"), "Invalid input");
	}


	@Test
	public void addManyNumbersTest(){
		Calculator calculator = new Calculator();
//		Assert.assertEquals(calculator.calculate("2+8+1"), "");
	}
}

