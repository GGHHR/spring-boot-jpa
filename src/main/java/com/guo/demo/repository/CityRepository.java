package com.guo.demo.repository;

import com.guo.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CityRepository  extends JpaRepository<City, Integer> {


}
