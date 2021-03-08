package com.example.mytask.service.impl;

import com.example.mytask.service.FibonacciService;
import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public Integer fibonacci(Integer number) {
       
        int fibo1 = 0, fibo2 = 1, fibonacci=1;
        
        for (int i = 0; i <= number-2; i++) {
            
        	fibonacci = fibo1 + fibo2;
            
            System.out.println(fibonacci+"\t");
            
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }

}
