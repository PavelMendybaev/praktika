package com.example.demo.controller.controller;


import com.example.demo.service.UtilService;
import com.example.demo.util.UtilGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    private UtilService utilService;


    @GetMapping("/main")
    public String GetMain(){

        utilService.upXod();

        return "main";

    }
    @GetMapping("/servers")
    public String getServers(){
        return "servers";
    }
    @GetMapping("/servers/{id}")
    public String getServer(@PathVariable Long id){
        return "server";
    }



}
