package com.misiontic.reto3.repository;

import com.misiontic.reto3.entities.Category;
import com.misiontic.reto3.entities.Ortopedic;
import com.misiontic.reto3.repository.crudRepository.OrtopedicCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrtopedicRepository {

    @Autowired
    private OrtopedicCrudRepository ortopedicCrudRepository;

    public List<Ortopedic> getAll(){
        return (List<Ortopedic>) ortopedicCrudRepository.findAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id){
        return ortopedicCrudRepository.findById(id);

    }
    public Ortopedic save(Ortopedic c){
        return ortopedicCrudRepository.save(c);
    }
    public void delete(Ortopedic c){
        ortopedicCrudRepository.delete(c);
    }
}
