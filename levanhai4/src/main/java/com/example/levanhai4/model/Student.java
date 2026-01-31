package com.example.levanhai4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;

    // ===== THÊM =====
    private Integer age;
    private String gender;
    // =================

    public Student() {
    }

    public Student(Integer id, String name, String email, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // ===== GET =====
    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    // ===============

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ===== SET =====
    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    // ===============
}
