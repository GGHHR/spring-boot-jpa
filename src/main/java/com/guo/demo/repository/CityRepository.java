package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository  extends CrudRepository<City, Integer> {

    @Query("select  a from City  a where a.Name = ?1")
    City findByName(String Name);
}
