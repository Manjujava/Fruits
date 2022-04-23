package com.org.hcl.controller;

import com.org.hcl.model.Fruits;
import com.org.hcl.service.FruitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class FruitsController {
    @Autowired
    FruitsService fruitsService;

    @PostMapping("/cc")
    public void createFruits(@RequestBody Fruits fruits) {
        fruitsService.createFruits(fruits);
    }

    @GetMapping("/getAll")
    public List<Fruits> getAll() {
        List<Fruits> ma = fruitsService.getAll();
        return ma;

    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id) {
        String v = fruitsService.deleteById(id);
        return v;


    }

    @DeleteMapping("/deleteByName/{name}")
    public String deleteById(@PathVariable String name) {
        String mm = fruitsService.deleteByName(name);
        return mm;
    }

    @PutMapping("/update")
    public void updateFruits(@RequestBody Fruits fruits) {
            fruitsService.updateFruits(fruits);
    }
}

