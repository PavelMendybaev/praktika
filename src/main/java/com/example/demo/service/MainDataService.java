package com.example.demo.service;

import com.example.demo.model.MainData;
import com.example.demo.repository.MainDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;
import java.util.List;

@Service
public class MainDataService {
    @Autowired
    private MainDataRepository mainDataRepository;

    public List<MainData> getMainData(){
        return mainDataRepository.findAll();

    }
    public void createMainData(){
        mainDataRepository.save(new MainData());
    }



}
