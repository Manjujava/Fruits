package com.org.hcl.service;

import com.org.hcl.model.Fruits;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FruitsService {


    public void createFruits(Fruits fruits);

    public List<Fruits> getAll();
    public String deleteById( Integer id);
    public String deleteByName( String name);
    public void updateFruits( Fruits fruits);



}


