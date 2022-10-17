package com.nestdigital.CourseApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/")
    public  String Homepage(){
        return "Welcome To HomePage";

    }

    @PostMapping("/read")
    public String Readpage(){
        return "Read Page";
    }

    @GetMapping("/viewall")
    public List Viewall(){
        List<String> myList = new ArrayList<>();
        myList.add("{'name':'Anand','age':23}");
        return myList;
    }


    @GetMapping("/student")
    public  String Student(){
        return "Saranya";
    }

}

