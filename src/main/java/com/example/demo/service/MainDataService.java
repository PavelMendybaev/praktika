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

    public MainData getMainData(){
        List<MainData> mainDatas = mainDataRepository.findAll();
        return mainDatas.get(0);
    }
    public void createMainData(){
        mainDataRepository.save(new MainData());
    }

}
