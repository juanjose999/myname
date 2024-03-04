package com.myname.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/minombre")
public class MyNameController {

    @GetMapping
    public String printlMyName(){
        return "juan jose sierra ortega";
    }
}
