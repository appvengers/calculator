package com.calculatorProject.calculatorProject;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public String calculate(String aritmeticExpression) {
        String operation;
        String []numbers;


        String regexNumber = "(\\d+)";
        String regexNumberOperatorNumber = "(\\d+)\\+(\\d+)";


        Matcher matcher = Pattern.compile(regexNumberOperatorNumber).matcher(aritmeticExpression);

        while (matcher.find()) {
            operation = matcher.group();

            matcher = Pattern.compile(regexNumber).matcher(operation);

//            while (matcher.find()) {
//                System.out.println(matcher.group(1));
//                System.out.println(matcher.group(2));
//            }

        }
        return "";
    }

}
