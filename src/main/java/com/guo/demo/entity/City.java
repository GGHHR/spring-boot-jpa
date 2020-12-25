package com.guo.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public  class City {
    @Id
    private Integer Id;
    private String Name;
    private String Countrycode;
    private String District;
    private Integer Population;
}
