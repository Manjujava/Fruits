package com.org.hcl.service;

import com.org.hcl.model.Fruits;
import com.org.hcl.repo.FruitsRepo;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.org.apache.bcel.internal.generic.DRETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service

public class FruitsServiceImpl implements FruitsService {
@Autowired
    FruitsRepo fruitsRepo;
    @Override
    public void createFruits(Fruits fruits) {
        fruitsRepo.save(fruits);


    }

    @Override
    public List<Fruits> getAll() {
      List<Fruits> me =fruitsRepo.findAll();
        return me;
    }

    @Override
    public String deleteById(Integer id) {
    fruitsRepo.deleteById(id);
    return "ma";

    }

    @Override
    public String deleteByName(String name) {
        fruitsRepo.deleteByName(name);
        return "null";
    }

    @Override
    public void updateFruits(Fruits fruits) {
        fruitsRepo.save(fruits);


    }


}



