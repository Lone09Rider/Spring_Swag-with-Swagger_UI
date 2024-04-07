package com.example.studentmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String stream;

    public Student() {
    }

    public Student(String name, String stream) {
        this.name = name;
        this.stream = stream;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStream() {
        return stream;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                '}';
    }
}