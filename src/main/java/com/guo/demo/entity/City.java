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

    @Column(name="district",length = 100)
    private String district;

    private Integer population;

    @CreatedDate
    private Date creatAt;


   /* @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district=" + district +
                ", countryCode=" + countryCode +
                ", creatAt=" + creatAt +
                '}';
    }*/
}
