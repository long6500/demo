package com.example.demo.controller;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.repository.StudebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    StudebtRepository studebtRepository;

    @GetMapping("/asd")
    public List<StudentEntity> getAll(){
        System.out.println("aaaaaaaaaaaaa");
        return studebtRepository.findAll();
    }
}
