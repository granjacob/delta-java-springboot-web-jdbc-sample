package com.apisample.service;

import com.apisample.entity.Persona;

import java.util.List;
import java.util.UUID;

public interface PersonaService {
    Persona save(Persona persona);
    List<Persona> findAll();
    Persona findById(UUID id);
    void deleteById(UUID id);
}