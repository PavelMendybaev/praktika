package com.example.demo.controller.restController;

import com.example.demo.model.MainData;
import com.example.demo.model.Server;
import com.example.demo.model.User;
import com.example.demo.service.MainDataService;
import com.example.demo.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ServersRestController {

    @Autowired
    private ServerService serverService;

    @Autowired
    private MainDataService mainDataService;




    @GetMapping("/servers")
    public List<Server> getServers(){
        return serverService.servers();
    }

    @GetMapping("/servers/{id}")
    public Server getServer(@PathVariable Long id){
        Server server = new Server();
        List<Server> servers = serverService.servers();
        for (Server serv : servers){
            if(serv.getId() == id){
                server = serv;
            }
        }

        return server;
    }
    @GetMapping("/main")
    public String getMainData(){
        return "123";
    }
}
