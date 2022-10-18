package com.misiontic.reto3.controller;


import com.misiontic.reto3.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    private MessageController messageController;

    @GetMapping("/all")
    public List<Category> getAll(){
        return messageController.getAll();
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category p){
        return messageController.save(p);
    }
}
