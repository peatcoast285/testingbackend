package com.example.demo2.controller;

import com.example.demo2.entities.Test;
import com.example.demo2.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getdata")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/test")
    public ResponseEntity<?> execute(){

        return new ResponseEntity<>(mainService.execute(),HttpStatus.OK);

    }

    @GetMapping("/test/{id}")
    public ResponseEntity<?> queryById(@PathVariable("id") String id){
        return new ResponseEntity<>(mainService.queryById(id),HttpStatus.OK);
    }

}
