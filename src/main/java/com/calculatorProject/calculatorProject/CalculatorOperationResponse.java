package com.calculatorProject.calculatorProject;


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
    private Map<Integer, String> error;
    private String data;

}
