package com.calculatorProject.calculatorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin(origins = "/**")
    @PostMapping(path = "/services/operations/V1")
    public ResponseEntity<CalculatorOperationResponse> operateTwoNumbers(@RequestBody Calculator calculator) {
        return new ResponseEntity<CalculatorOperationResponse>(calculator.operate(calculator.getFirstNumber(),
                calculator.getSecondNumber(), calculator.getOperation()), HttpStatus.OK);
    }

    @CrossOrigin(origins = "/**")
    @PostMapping(path = "/services/operations/V2")
    public ResponseEntity<CalculatorOperationResponse> arithmeticOperation(@RequestBody String operation) {

        CalculatorOperationResponse response = new CalculatorOperationResponse();

        Map<String, String> map = new HashMap<>();
        map.put("500", "Internal Server Error");


        response.setStatus(false);
        response.setError(map);
        response.setData(map);


        return new ResponseEntity<CalculatorOperationResponse>(response, HttpStatus.OK);
    }

}

