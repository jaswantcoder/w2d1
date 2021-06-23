package com.sapient.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
public class Customer {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private int id;
    private String name;
    private String city;
    private String email;
    private String phone;

}
