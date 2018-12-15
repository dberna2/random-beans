package com.mercurytfs.mercury.common.test.util.configuration.randomizer;

import com.mercurytfs.mercury.common.test.util.dto.Car;
import io.github.benas.randombeans.api.Randomizer;

import java.util.function.Supplier;

public class CarRandomizer implements Supplier<Car> {

    @Override
    public Car get() {
        Car car = new Car();
        car.setName("MAZDA");
        car.setColor(2);
        return car;
    }
}
