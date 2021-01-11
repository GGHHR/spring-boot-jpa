package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CityRepository<T> extends CrudRepository<T, Integer> {

    City findByName(String name);
}
