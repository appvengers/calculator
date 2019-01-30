package com.calculatorProject.calculatorProject;

public class Calculator {

    private String firstNumber;
    private String secondNumber;

    public Calculator() {
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String addTwoNumbers(String numberOne, String numberTwo) {
        return String.valueOf(Integer.parseInt(numberOne) + Integer.parseInt(numberTwo));
    }
}
