package com.example.mytask.controller;

import com.example.mytask.service.impl.FibonacciServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class FibonacciController {

    private final FibonacciServiceImpl fibonacciService;

    public FibonacciController(FibonacciServiceImpl fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    // http://localhost:8080/api/fibonacci?sequence=12
    @RequestMapping(value = "/fibonacci", method = RequestMethod.GET)
    String fibonacciCalculationPage(Model model, @RequestParam(required = false) Integer sequence) {
        Integer sequences = fibonacciService.fibonacci(sequence);
        String message = String.format("Fibonacci Sonucu = %s", sequences);
        model.addAttribute("message", message);
        return "fibonacci";
    }
}