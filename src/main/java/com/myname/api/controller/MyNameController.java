package com.myname.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

    @GetMapping
    public ResponseEntity<?> printMyName(){
        return new ResponseEntity<>("! Juan Jose Sierra Ortega !", HttpStatus.OK) ;
    }
}
