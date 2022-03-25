package com.example.demo.controller.restController;

import com.example.demo.model.Server;
import com.example.demo.model.User;
import com.example.demo.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/servers")
public class ServersRestController {
    private final ServerService serverService;

    @Autowired
    public ServersRestController(ServerService serverService) {
        this.serverService = serverService;
    }

    @GetMapping("/api/servers")
    public List<Server> getServers(){
        return serverService.servers();
    }
}
