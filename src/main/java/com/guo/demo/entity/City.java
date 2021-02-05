package com.guo.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss",timezone = "GMT+8")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creatAt=new Date();


}
