package com.calculatorProject.calculatorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @PostMapping(path = "/services/operations/V2")
    public ResponseEntity<CalculatorOperationResponse> arithmeticOperation(@RequestBody String operation) {

        CalculatorOperationResponse response = new CalculatorOperationResponse();

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(500, "Internal Server Error");

        response.setStatus(false);
        response.setError(map);
        response.setData("45");



        return new ResponseEntity<CalculatorOperationResponse>(response, HttpStatus.OK);

    }

}

