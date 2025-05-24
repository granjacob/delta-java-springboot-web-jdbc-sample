package com.apisample.service;

import com.apisample.entity.Persona;
import com.apisample.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findById(UUID id) {
        Optional<Persona> optional = personaRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        personaRepository.deleteById(id);
    }
}
