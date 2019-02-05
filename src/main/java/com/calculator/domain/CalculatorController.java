package com.calculator.domain;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CalculatorController {

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to Kata Inc Calculator!";
    }

//    @PostMapping(path = "/services/operations/V1")
//    public CalculatorOperationResponse operateTwoNumbers(@RequestBody Calculator calculator) {
//        return calculator.operate(calculator.getFirstNumber(), calculator.getSecondNumber(), calculator.getOperation());
//    }

}
