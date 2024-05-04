package com.swiftfingers.stored_procedure_demo.controller;

import java.util.List;

import com.swiftfingers.stored_procedure_demo.entity.Car;
import com.swiftfingers.stored_procedure_demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {


    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(path = "/modelcount")
    public long getTotalCarsByModel(@RequestParam("model") String model) {
        return carService.getTotalCarsByModel(model);
    }

    @GetMapping(path = "/modelcountP")
    public long getTotalCarsByModelProcedureName(@RequestParam("model") String model) {
        return carService.getTotalCarsByModelProcedureName(model);
    }

    @GetMapping(path = "/modelcountV")
    public long getTotalCarsByModelValue(@RequestParam("model") String model) {
        return carService.getTotalCarsByModelValue(model);
    }

    @GetMapping(path = "/modelcountEx")
    public long getTotalCarsByModelExplicit(@RequestParam("model") String model) {
        return carService.getTotalCarsByModelExplicit(model);
    }

    @GetMapping(path = "/modelcountEn")
    public long getTotalCarsByModelEntity(@RequestParam("model") String model) {
        return carService.getTotalCarsByModelEntity(model);
    }

    @GetMapping(path = "/carsafteryear")
    public List<Car> findCarsAfterYear(@RequestParam("year") Integer year) {
        return carService.findCarsAfterYear(year);
    }
}
