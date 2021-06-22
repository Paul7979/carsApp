package com.example.carsapp;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DBInitializer {

    private final CarsRepository carsRepository;

    @PostConstruct
    public void fillDB() {
        carsRepository.saveAll(List.of(
                new Car("Ford", "Mustang", 1974),
                new Car("Volkswagen", "Golf", 2010),
                new Car("Volkswagen", "Polo", 2008)
        ));
    }



}
