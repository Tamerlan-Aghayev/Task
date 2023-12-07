package com.example.demo.controller;

import com.example.demo.service.FullResponseService;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AsanController {
    private final FullResponseService service;
    @GetMapping("/api/new-request{pin}")
    public ResponseEntity<Response.Body> getNew(@PathVariable("pin") String pin) throws Exception{
        Response.Body body=service.addResponseToDB(pin);
        return ResponseEntity.ok(body);
    }
}
