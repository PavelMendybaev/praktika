package com.example.demo.controller.controller;


import com.example.demo.service.UtilService;
import com.example.demo.util.UtilGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private UtilService utilService;


    @GetMapping("/main")
    public String GetMain(){

        utilService.upXod();

        return "main";

    }

}
