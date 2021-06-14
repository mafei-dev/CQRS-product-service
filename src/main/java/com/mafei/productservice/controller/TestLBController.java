package com.mafei.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Map;

/*
  @Author kalhara@bowsin
  @Created 6/15/2021 2:24 AM  
*/
@RestController
@RequestMapping
public class TestLBController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping
    public ResponseEntity<Map<String, String>> index() {
        return ResponseEntity.ok().body(Collections.singletonMap("message", "I am from " + request.getLocalPort()));
    }
}
