package com.calculator.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CalculatorOperationResponse {

    private boolean status;
    private Map<String, String> error;
    private Map<String, String> data;

}
