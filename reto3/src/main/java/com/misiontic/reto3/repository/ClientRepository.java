package com.misiontic.reto3.repository;

import com.misiontic.reto3.entities.Client;

import com.misiontic.reto3.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }
    public Client save(Client p){
        return clientCrudRepository.save(p);
    }
    public void delete(Client p){
        clientCrudRepository.delete(p);
    }
}
