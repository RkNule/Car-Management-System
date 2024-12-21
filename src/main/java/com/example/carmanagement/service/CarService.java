package com.example.carmanagement.service;

import com.example.carmanagement.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CarService {
    Page<Car> getAllCars(Pageable pageable);
    Car saveCar(Car car);
    Optional<Car> getCarById(Long id);
    void deleteCar(Long id);
    List<Car> searchCars(String keyword);
}
