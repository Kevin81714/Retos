package com.misiontic.reto3.service;

import com.misiontic.reto3.entities.Category;
import com.misiontic.reto3.entities.Product;
import com.misiontic.reto3.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryRepository.getCategory(id);
    }

    public Category save(Category p) {
        if (p.getId() == null) {
            return categoryRepository.save(p);
        } else {
            Optional<Category> e = categoryRepository.getCategory(p.getId());
            if (e.isPresent()) {
                return p;
            } else {
                return categoryRepository.save(p);
            }
        }
    }
    public Category update(Category p){
        if(p.getId()!=null){
            Optional<Category> q = categoryRepository.getCategory(p.getId());
            if(q.isPresent()){
                if(p.getName()!=null) {
                    q.get().setName(p.getName());
                }
                if(p.getDescription()!=null) {
                    q.get().setDescription(p.getDescription());
                }
                if(p.getOrtopedics()!=null) {
                    q.get().setOrtopedics(p.getOrtopedics());
                }
                categoryRepository.save(q.get());
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
        Optional<Category>p= categoryRepository.getCategory(id);
        if(p.isPresent()){
            categoryRepository.delete(p.get());
            flag=true;
        }

        return flag;
    }
}

