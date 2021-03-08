package com.example.mytask.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.mytask.service.impl.FibonacciServiceImpl;

@RestController
@RequestMapping("/api")
public class FibonacciRestController {
	
	private final FibonacciServiceImpl fibonacciService;

    public FibonacciRestController (FibonacciServiceImpl fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    // http://localhost:8080/api/fibonacci/calculator?sequence=12
    @GetMapping(value = "/fibonacci/calculator", produces = "application/json")
    public ResponseEntity<Integer> fibonacciCalculation(@RequestParam int sequence)
    {
    	Integer sequences = fibonacciService.fibonacci(sequence);
        return ResponseEntity.ok(sequences);

    }
}
