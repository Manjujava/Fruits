package com.org.hcl.repo;

import com.org.hcl.model.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FruitsRepo extends JpaRepository<Fruits,Integer> {
  @Transactional
  String deleteByName( String name);


}