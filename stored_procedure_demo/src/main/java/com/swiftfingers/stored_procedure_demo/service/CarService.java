package com.swiftfingers.stored_procedure_demo.service;

import java.util.List;

import com.swiftfingers.stored_procedure_demo.entity.Car;
import com.swiftfingers.stored_procedure_demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarService {


    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public int getTotalCarsByModel(String model) {
        return carRepository.getTotalCarsByModel(model);
    }

    public int getTotalCarsByModelProcedureName(String model) {
        return carRepository.getTotalCarsByModelProcedureName(model);
    }

    public int getTotalCarsByModelValue(String model) {
        return carRepository.getTotalCarsByModelValue(model);
    }

    public int getTotalCarsByModelExplicit(String model) {
        return carRepository.GET_TOTAL_CARS_BY_MODEL(model);
    }

    public int getTotalCarsByModelEntity(String model) {
        return carRepository.getTotalCarsByModelEntiy(model);
    }

    public List<Car> findCarsAfterYear(Integer year) {
        return carRepository.findCarsAfterYear(year);
    }
}