package com.guo.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public  class City {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String countryCode;

    @Column(name="district",length = 100)
    private String district;

    private Integer population;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creatAt=new Date();


}
