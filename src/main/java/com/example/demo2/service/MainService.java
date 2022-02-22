package com.example.demo2.service;

import com.example.demo2.entities.Test;
import com.example.demo2.repositoties.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private TestRepository testRepository;

    public List<Test> execute(){
        return testRepository.findAll();
    }

    public Test queryById(String id){
        return testRepository.findById(id).orElse(null);

    }
}
