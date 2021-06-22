package com.example.carsapp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarsController {

    private final CarsRepository carsRepository;

    @GetMapping("/all")
    public List<Car> getAll() {
        return carsRepository.findAll();
    }
}
