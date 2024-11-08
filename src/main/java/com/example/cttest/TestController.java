package com.example.cttest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final CompileServiceClient compileServiceClient;

    @GetMapping("/test/{id}")
    public String test(@PathVariable int id) {
        return compileServiceClient.findCode(id).toString();
    }
}
