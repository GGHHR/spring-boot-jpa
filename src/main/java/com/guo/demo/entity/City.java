package com.guo.demo.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public  class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String countrycode;

    @Column(name="district")
    private String district;
    private Integer population;
}
