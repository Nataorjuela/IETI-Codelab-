package com.example.demo.entities;

import com.example.demo.dto.UserDTO;

public class User {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private String createdAt;
    public User(){

    }
    public User(UserDTO userDto) {
        this.id=userDto.getId();
        this.name= userDto.getName();
        this.email= userDto.getEmail();
        this.lastName= userDto.getLastName();
        this.createdAt= userDto.getCreatedAt();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}