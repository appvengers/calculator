package com.calculatorProject.calculatorproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

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
                    mapData.put("result:",
                            new BigInteger(new BigInteger(numberOne).add(new BigInteger(numberTwo)).toString()).toString());
                    response.setData(mapData);
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "subtract":
                    mapData.put("result:",
                            new BigInteger(new BigInteger(numberOne).subtract(new BigInteger(numberTwo)).toString()).toString());
                    response.setData(mapData);
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "multiply":
                    mapData.put("result:",
                            new BigInteger(new BigInteger(numberOne).multiply(new BigInteger(numberTwo)).toString()).toString());
                    response.setData(mapData);
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "divide":
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

}
