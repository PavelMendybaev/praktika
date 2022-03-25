package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    Long id;
    @Column
    String name;
    @Column
    String password;
    @Column
    String Role;
}
