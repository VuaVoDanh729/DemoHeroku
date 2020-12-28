package com.codelearn.demo.controller;

import com.codelearn.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class Hello {

    @RequestMapping(value = "")
    public String hello() {
        return "home";
    }
}
