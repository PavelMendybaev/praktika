package com.example.demo.model;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Server {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id ;
    @Column
    String name = "testName";
    @OneToMany
    @JoinColumn
    List<User> users = null;

    public Server(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public Server(String name) {
        this.name = name;
    }
    public Server(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
