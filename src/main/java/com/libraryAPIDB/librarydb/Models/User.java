package com.libraryAPIDB.librarydb.Models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Getter
@Setter
@RequestMapping("user")
@Table(name="user_db")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id will be auto increment
    private int id;
    private String name;
    private String emil;
    private int age;

    public User() {
    }

    public User(int id, String name, String emil, int age) {
        this.id = id;
        this.name = name;
        this.emil = emil;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
