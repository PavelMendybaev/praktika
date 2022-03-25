package com.example.demo.service;

import com.example.demo.model.Server;
import com.example.demo.model.Util;
import com.example.demo.repository.UtilRepository;
import com.example.demo.util.UtilGame;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Handler;

@Service
public class UtilService {
    @Autowired
    private UtilRepository utilRepository;
    @Autowired
    private ServerService serverService;
    @Autowired
    private MainDataService mainDataService;

    public List<Util> utils(){
        return utilRepository.findAll();
    }
    public void addUtil(){
        utilRepository.save(new Util());
    }

    public void upXod(){

        try{
            Util util = utilRepository.getById(1L);
            util.setXod(util.getXod() + 1);
            utilRepository.save(util);
        } catch (Exception e){
            System.out.println("сохранение UTIL");
            addUtil();
            System.out.println("оздание серверов UTIL");
            serverService.addServers(5);
            mainDataService.createMainData();
            System.out.println("готов");
        }

    }


}
