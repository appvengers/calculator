package com.calculatorProject.calculatorProject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Calculator {


    private String firstNumber;
    private String secondNumber;
    private String operation;


    /**
     * Method that operate two numbers in string format
     *
     * @param numberOne first number to operate
     * @param numberTwo second number to operate
     * @return operation result
     */
    public String operate(String numberOne, String numberTwo, String operator) {
        try {
            switch (operator) {
                case "add":
                    return new BigInteger(new BigInteger(numberOne).add(new BigInteger(numberTwo)).toString()).toString();
                case "subtract":
                    return new BigInteger(new BigInteger(numberOne).subtract(new BigInteger(numberTwo)).toString()).toString();
                case "multiply":
                    return new BigInteger(new BigInteger(numberOne).multiply(new BigInteger(numberTwo)).toString()).toString();
                case "divide": // TODO implement divide method
                    return new BigInteger(new BigInteger(numberOne).divide(new BigInteger(numberTwo)).toString()).toString();
                default:
                    return "Wrong operation";
            }


        } catch (NumberFormatException ex) {
            return "Invalid input";
        }
    }

    public String calculate(String aritmeticExpression) {
        String operation;
        String[] numbers;


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
