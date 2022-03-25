package com.example.demo.controller.restController;

import com.example.demo.model.MainData;
import com.example.demo.model.Server;
import com.example.demo.service.MainDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/main")
public class MainResttController {

    @Autowired
    private MainDataService mainDataService;

    @GetMapping
    public MainData getMainData(){
        MainData mainData = new MainData();
        List<MainData> servers = mainDataService.getMainData();

        return servers.get(0);
    }
}
