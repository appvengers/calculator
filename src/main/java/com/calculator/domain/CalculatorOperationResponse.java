package com.calculator.domain;


import lombok.*;

import java.util.Map;

@AllArgsConstructor
@Data
public class CalculatorOperationResponse {

    private boolean status;
    private ErrorResponse error;
    private ResultResponse data;

}

@AllArgsConstructor
@Data
class ResultResponse {
    private String result;


}

@AllArgsConstructor
@Data
class ErrorResponse {
    private String code;
    private String message;
}
