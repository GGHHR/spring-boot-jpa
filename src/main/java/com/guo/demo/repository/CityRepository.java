package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository  extends CrudRepository<City, Integer> {
    City findById(String id);
}
