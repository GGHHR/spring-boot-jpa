package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    @Query(value = "select * from city a where name like :name% ",nativeQuery = true)
    List<City> findByName(@Param("name") String name);

    List<City> findByDistrict( String district);

}
