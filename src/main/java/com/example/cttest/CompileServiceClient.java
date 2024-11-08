package com.example.cttest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "compile-service")
public interface CompileServiceClient {

    @GetMapping("/code/{id}")
    BaseResponse<Code> findCode(@PathVariable Integer id);
}
