package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class MainData {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    @Column
    Long many = 0L;
    @Column
    String zametki = "";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMany() {
        return many;
    }

    public void setMany(Long many) {
        this.many = many;
    }

    public String getZametki() {
        return zametki;
    }

    public void setZametki(String zametki) {
        this.zametki = zametki;
    }

}
