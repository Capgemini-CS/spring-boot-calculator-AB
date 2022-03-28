package com.example.org.calculator.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService{


    private final AdditionService additionService;
    private final SubstractionService substractionService;
    private final MultiplicationService multiplicationService;
    private final DivisionService divisionService;

    @Autowired
    public CalculatorService(AdditionService additionService, SubstractionService substractionService, MultiplicationService multiplicationService, DivisionService divisionService){
        this.additionService = additionService;
        this.substractionService = substractionService;
        this.multiplicationService = multiplicationService;
        this.divisionService = divisionService;
    }

    public float getOperationResult(int firstNumber, int secondNumber, String operator){
        float result = 0;
        switch (operator) {
            case "+":
                result = additionService.calculate(firstNumber, secondNumber);
                break;
            case "-":
                result = substractionService.calculate(firstNumber, secondNumber);
                break;
            case "*":
                result = multiplicationService.calculate(firstNumber, secondNumber);
                break;
            case "/":
                result = divisionService.calculate(firstNumber, secondNumber);
                break;
        }
        System.out.println(result);
        return result;
    }
}
