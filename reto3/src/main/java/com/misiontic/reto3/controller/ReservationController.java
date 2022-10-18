package com.misiontic.reto3.controller;


import com.misiontic.reto3.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationController reservationController;

    @GetMapping("/all")
    public List<Category> getAll(){
        return reservationController.getAll();
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category p){
        return reservationController.save(p);
    }
}
