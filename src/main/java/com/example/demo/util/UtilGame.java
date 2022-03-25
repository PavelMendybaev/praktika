package com.example.demo.util;


import com.example.demo.model.Server;
import com.example.demo.service.ServerService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UtilGame {

    @Autowired
    private ServerService serverService;

    public void addServers(int num){

        for (int i = 0 ; i < num ; i++){

            RandomString randomString = new RandomString(8);
            String str = randomString.nextString();
            Server server = new Server(str);
            serverService.save(server);
        }

    }
}
