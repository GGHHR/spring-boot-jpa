package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository  extends JpaRepository<City, Integer> {

}
