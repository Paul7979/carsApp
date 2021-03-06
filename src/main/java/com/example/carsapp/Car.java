package com.example.carsapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "t_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String brand;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private int buildYear;

    public Car(String brand, String name, int buildYear) {
        this.id = null;
        this.brand = brand;
        this.name = name;
        this.buildYear = buildYear;
    }
}
