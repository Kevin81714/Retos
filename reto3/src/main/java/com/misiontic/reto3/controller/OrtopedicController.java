package com.misiontic.reto3.controller;


import com.misiontic.reto3.entities.Ortopedic;
import com.misiontic.reto3.entities.Product;
import com.misiontic.reto3.service.OrtopedicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Ortopedic")
public class OrtopedicController {

    @Autowired
    private OrtopedicService ortopedicService;

    @GetMapping("/all")
    public List<Ortopedic> getAll(){
        return ortopedicService.getAll();
    }

    @PostMapping("/save")
    public Ortopedic save(@RequestBody Ortopedic p){
        return ortopedicService.save(p);
    }
}
