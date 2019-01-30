package com.calculatorProject.calculatorProject;

import lombok.*;

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
            return String.valueOf(Integer.parseInt(numberOne) + Integer.parseInt(numberTwo));
        } catch (NumberFormatException ex) {
            return "Invalid input";
        }
    }
}
