package com.calculator.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CalculatorOperationResponse {

    private boolean status;
    private ErrorResponse error;
    private DataResponse data;

}

@AllArgsConstructor
@Data
class DataResponse {
    private String result;


}

@AllArgsConstructor
@Data
class ErrorResponse {
    private String code;
    private String message;
}
