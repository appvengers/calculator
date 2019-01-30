package com.calculatorProject.calculatorProject;

import lombok.*;

@Getter
@Setter
public class Calculator {


    private String firstNumber;
    private String secondNumber;

    public String addTwoNumbers(String numberOne, String numberTwo) {
        return String.valueOf(Integer.parseInt(numberOne) + Integer.parseInt(numberTwo));
    }
}
