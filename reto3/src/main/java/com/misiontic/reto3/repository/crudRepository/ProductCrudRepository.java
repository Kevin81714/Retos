package com.misiontic.reto3.repository.crudRepository;

import com.misiontic.reto3.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
}
