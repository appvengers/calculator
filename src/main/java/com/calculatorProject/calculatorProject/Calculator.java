package com.calculatorProject.calculatorProject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
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
    public CalculatorOperationResponse operate(String numberOne, String numberTwo, String operator) {
        CalculatorOperationResponse response = new CalculatorOperationResponse();
        Map<String, String> mapError = new HashMap<>();
        Map<String, String> mapData = new HashMap<>();


        try {
            switch (operator) {
                case "add":
//                    mapError.put("code", "200");
//                    mapError.put("message", "OK");
                    mapData.put("result:",
                            new BigInteger(new BigInteger(numberOne).add(new BigInteger(numberTwo)).toString()).toString());
                    response.setData(mapData);
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "subtract":
//                    mapError.put("code", "200");
//                    mapError.put("message", "OK");
                    mapData.put("result:",
                            new BigInteger(new BigInteger(numberOne).subtract(new BigInteger(numberTwo)).toString()).toString());
                    response.setData(mapData);
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "multiply":
//                    mapError.put("code", "200");
//                    mapError.put("message", "OK");
                    mapData.put("result:",
                            new BigInteger(new BigInteger(numberOne).multiply(new BigInteger(numberTwo)).toString()).toString());
                    response.setData(mapData);
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "divide": // TODO implement divide method
//                    mapError.put("code", "200");
//                    mapError.put("message", "OK");

                    if (numberTwo.equals("0")) {
                        mapData.put("result:", "Can't divide by zero");

                        response.setData(mapData);
                        response.setStatus(false);
                        mapError.put("code", "500");
                        mapError.put("message", "Can't divide by zero");
                        response.setError(mapError);
                        return response;
                    } else {
                        mapData.put("result:",
                                new BigInteger(new BigInteger(numberOne).divide(new BigInteger(numberTwo)).toString()).toString());
                        response.setData(mapData);
                        response.setStatus(true);
                        response.setError(null);
                        return response;
                    }

                default:
//                    mapError.put("code", "200");
//                    mapError.put("message", "OK");
                    mapData.put("result:", "Invalid Input Data");
                    response.setData(mapData);
                    response.setStatus(false);
                    response.setError(null);
                    return response;
            }


        } catch (NumberFormatException ex) {
            mapError.put("500", "Internal server Error NumberFormatException");
            mapData.put("result:", "Invalid Input");
            response.setStatus(true);
            response.setError(null);
            return response;
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
