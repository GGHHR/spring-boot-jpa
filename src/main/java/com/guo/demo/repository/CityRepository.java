package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

    @Query(value = "select * from city where name = ?1 ",nativeQuery = true)
    City findByName( String name);

    City findByDistrict( String district);
}
