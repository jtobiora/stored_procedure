package com.swiftfingers.stored_procedure_demo.repository;

import java.util.List;

import com.swiftfingers.stored_procedure_demo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    @Procedure
    int GET_TOTAL_CARS_BY_MODEL(String model);

    @Procedure("GET_TOTAL_CARS_BY_MODEL")
    int getTotalCarsByModel(String model);

    @Procedure(procedureName = "GET_TOTAL_CARS_BY_MODEL")
    int getTotalCarsByModelProcedureName(String model);

    @Procedure(value = "GET_TOTAL_CARS_BY_MODEL")
    int getTotalCarsByModelValue(String model);

    @Procedure(name = "Car.getTotalCardsbyModelEntity")
    int getTotalCarsByModelEntiy(@Param("model_in") String model);

    @Query(value = "CALL FIND_CARS_AFTER_YEAR(:year_in);", nativeQuery = true)
    List<Car> findCarsAfterYear(@Param("year_in") Integer year_in);

}