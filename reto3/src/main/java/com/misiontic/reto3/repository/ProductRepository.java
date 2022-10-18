package com.misiontic.reto3.repository;

import com.misiontic.reto3.entities.Product;
import com.misiontic.reto3.repository.crudRepository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }
    public Optional<Product> getProduct(int id){
        return productCrudRepository.findById(id);
    }
    public Product save(Product p){
        return productCrudRepository.save(p);
    }
    public void delete(Product p){
        productCrudRepository.delete(p);
    }
}

