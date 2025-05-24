package com.apisample.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    private UUID id;

    private String name;
    private String lastname;
    private String address;

    // Constructors
    public Persona() {}

    public Persona(String name, String lastname, String address) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
