package com.example.org.calculator.resource;

import com.example.org.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService ;

    @GetMapping("/operation")
    public String getResult(@RequestParam String firstNumber, @RequestParam String secondNumber, @RequestParam String operator){
         float result =  calculatorService.getOperationResult(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber), operator);
         return "Equation: " + firstNumber + " + " + secondNumber + " = " + result;
    }

}
