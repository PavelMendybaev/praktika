package com.example.demo.service;

import com.example.demo.model.Server;
import com.example.demo.repository.ServerRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {
    private final ServerRepository serverRepository;

    @Autowired
    public ServerService(ServerRepository serverRepository) {
        this.serverRepository = serverRepository;
    }

    public List<Server> servers(){
        return serverRepository.findAll();
    }
    public void save(Server server){
        serverRepository.save(server);
    }

    public Server getServerById(Long id){
        return serverRepository.getById(id);
    }

    public void addServers(int num){

        for (int i = 0 ; i < num ; i++){

            RandomString randomString = new RandomString(8);
            String str = randomString.nextString();
            Server server = new Server(str);
            save(server);
        }

    }
}
