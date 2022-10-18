package com.misiontic.reto3.service;

import com.misiontic.reto3.entities.Category;
import com.misiontic.reto3.entities.Ortopedic;
import com.misiontic.reto3.repository.OrtopedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrtopedicService {

    @Autowired
    private OrtopedicRepository ortopedicRepository;

    public List<Ortopedic> getAll() {
        return ortopedicRepository.getAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id) {
        return ortopedicRepository.getOrtopedic(id);
    }

    public Ortopedic save(Ortopedic p) {
        if (p.getId() == null) {
            return ortopedicRepository.save(p);
        } else {
            Optional<Ortopedic> e = ortopedicRepository.getOrtopedic(p.getId());
            if (e.isPresent()) {
                return p;
            } else {
                return ortopedicRepository.save(p);
            }
        }
    }
    public Ortopedic update(Ortopedic p){
        if(p.getId()!=null){
            Optional<Ortopedic> q = ortopedicRepository.getOrtopedic(p.getId());
            if(q.isPresent()){
                if(p.getName()!=null) {
                    q.get().setName(p.getName());
                }
                if(p.getBrand()!=null) {
                    q.get().setBrand(p.getBrand());
                }
                if(p.getYear()!=null) {
                    q.get().setYear(p.getYear());
                }
                if(p.getDescription()!=null) {
                    q.get().setDescription(p.getDescription());
                }
                if(p.getCategory()!=null) {
                    q.get().setCategory(p.getCategory());
                }
                if(p.getMessages()!=null) {
                    q.get().setMessages(p.getMessages());
                }
                if(p.getReservations()!=null) {
                    q.get().setReservations(p.getReservations());
                }
                ortopedicRepository.save(q.get());
                return q.get();
            }else {
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Ortopedic>p= ortopedicRepository.getOrtopedic(id);
        if(p.isPresent()){
            ortopedicRepository.delete(p.get());
            flag=true;
        }

        return flag;
    }
}

