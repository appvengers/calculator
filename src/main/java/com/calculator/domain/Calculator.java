package com.calculator.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

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

        try {
            switch (operator) {
                case "add":
                    response.setData(new DataResponse(new BigInteger(new BigInteger(numberOne).add(new BigInteger(numberTwo)).toString()).toString()));
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "subtract":
                    response.setData(new DataResponse(new BigInteger(new BigInteger(numberOne).subtract(new BigInteger(numberTwo)).toString()).toString()));
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "multiply":
                    response.setData(new DataResponse(new BigInteger(new BigInteger(numberOne).multiply(new BigInteger(numberTwo)).toString()).toString()));
                    response.setStatus(true);
                    response.setError(null);
                    return response;
                case "divide":
                    if (numberTwo.equals("0")) {
                        response.setData(new DataResponse("Can't divide by zero"));
                        response.setStatus(false);
                        response.setError(new ErrorResponse("500", "Can't divide by zero"));
                        return response;
                    } else {
                        BigDecimal bid = new BigDecimal(new BigDecimal(numberOne).divide(new BigDecimal(numberTwo)).toString());
                        bid = bid.setScale(0, RoundingMode.UP);
                        response.setData(new DataResponse(bid.toString()));
                        response.setStatus(true);
                        response.setError(null);
                        return response;
                    }

                default:
                    response.setData(new DataResponse("Invalid Input Data, this operation is not supported"));
                    response.setStatus(false);
                    response.setError(null);
                    return response;
            }


        } catch (NumberFormatException ex) {
            response.setStatus(false);
            response.setData(new DataResponse("Invalid Input Data, This calculator can only operate with round numbers"));
            response.setError(new ErrorResponse("500", "Internal server Error NumberFormatException"));
            return response;
        }
    }

}
