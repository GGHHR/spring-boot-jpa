package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    @Query(value = "select * from city where name = ?1 ",nativeQuery = true)
    List findByName( String name);

    City findByDistrict( String district);
}
