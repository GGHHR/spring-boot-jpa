package com.guo.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

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

    @Column(name="district")
    private String district;

    private Integer population;

    @CreatedDate
    private Date creatAt;
}
