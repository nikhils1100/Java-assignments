package com.example.calculator;

import com.example.calculator.sharedFunctions.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class Controller {
    @Autowired
    private Calculator calc;

    @GetMapping("/add/{a}/{b}")
    public int addNumbers(@PathVariable int a, @PathVariable int b) {
        return calc.add(a,b);
    }
    @GetMapping("/subtract/{a}/{b}")
    public int subtractNumbers(@PathVariable int a, @PathVariable int b) {
        return calc.subtract(a,b);
    }
    @GetMapping("/multiply/{a}/{b}")
    public int multiplyNumbers(@PathVariable int a, @PathVariable int b) {
        return calc.multiply(a,b);
    }
    @GetMapping("/divide/{a}/{b}")
    public float divideNumbers(@PathVariable float a, @PathVariable float b) {
        return calc.divide(a,b);
    }
}
