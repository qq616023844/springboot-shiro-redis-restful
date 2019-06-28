package com.springbootshirorestful;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Proxy(lazy = false)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",unique = true,nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
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
}
