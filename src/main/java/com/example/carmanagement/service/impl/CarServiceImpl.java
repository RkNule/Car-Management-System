package com.example.carmanagement.service.impl;

import com.example.carmanagement.model.Car;
import com.example.carmanagement.repository.CarRepository;
import com.example.carmanagement.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    // Get all cars with pagination and sorting
    @Override
    public Page<Car> getAllCars(Pageable pageable) {
        return carRepository.findAll(pageable);
    }

    // Save a new car or update an existing car
    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    // Get a car by ID
    @Override
    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    // Delete a car by ID
    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    // Search cars globally by keyword
    @Override
    public List<Car> searchCars(String keyword) {
        return carRepository.searchCars(keyword);
    }
}
