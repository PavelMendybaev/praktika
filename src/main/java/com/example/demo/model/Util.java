package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Util {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    @Column
    Long xod = 0L;


    public Util(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getXod() {
        return xod;
    }

    public void setXod(Long xod) {
        this.xod = xod;
    }
}
