package com.input.impl;

import org.springframework.stereotype.Service;

import com.fuzora.service.TransformerService;

@Service
public class CustomTransformerService implements TransformerService {
    @Override
    public String transform(String input) {
        return "Transformed: " + input;
    }
}