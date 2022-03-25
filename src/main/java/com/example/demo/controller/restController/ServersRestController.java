package com.example.demo.controller.restController;

import com.example.demo.model.Server;
import com.example.demo.model.User;
import com.example.demo.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @GetMapping("/api/servers/{id}")
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
}
