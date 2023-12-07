package com.example.demo.client;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("http://test.asanfinance.gov.az")
public interface AsanClient {
    @GetMapping("/api/employee{pin}")
    Response getData(@PathVariable("pin") String pin ,@RequestParam("api-key") String apiKey);
}
