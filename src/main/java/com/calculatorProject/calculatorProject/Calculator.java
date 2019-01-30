package com.calculatorProject.calculatorProject;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
public class Calculator {


    private String firstNumber;
    private String secondNumber;
    private String operation;


    /**
     * Method that adds two numbers in string format
     * @param numberOne
     * @param numberTwo
     * @return operation result
     */
    public String addTwoNumbers(String numberOne, String numberTwo) {
        try {
            BigInteger numOne = new BigInteger(numberOne);
            BigInteger numTwo = new BigInteger(numberTwo);
            BigInteger result = new BigInteger(numOne.add(numTwo).toString());

            return result.toString();

        } catch (NumberFormatException ex) {
            return "Invalid input";
        }
    }
}
