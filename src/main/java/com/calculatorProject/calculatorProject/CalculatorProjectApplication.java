package com.calculatorProject.calculatorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorProjectApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Welcome to Kata Inc Calculator!";
    }

    @PostMapping(path = "/services/operations/V1")
    public String addTwoNumbers(@RequestBody Calculator calculator) {
        if (calculator.getOperation().equals("add")) {
            return calculator.addTwoNumbers(calculator.getFirstNumber(), calculator.getSecondNumber());
        } else {
            return "wrong operation";
        }

    }

}

