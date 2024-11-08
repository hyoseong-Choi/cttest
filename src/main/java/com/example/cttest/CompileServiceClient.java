package com.example.cttest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test2-service")
public interface CompileServiceClient {

    @GetMapping("/health")
    String findCode();
}
