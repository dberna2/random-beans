package com.mercurytfs.mercury.common.test.util.randomizer;

import com.mercurytfs.mercury.common.test.util.dto.Car;
import io.github.benas.randombeans.api.Randomizer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarRandomizer implements Randomizer<Car> {

    private Random random = new Random();

    @Override
    public Car getRandomValue() {
        return getCar();
    }

    private Car getCar(){
        List<Car> carList = Arrays.asList(
                new Car("Dos", 2),
                new Car("Tres", 3),
                new Car("Uos", 1),
                new Car("Cuatros", 4)
        );
        Integer item = random.nextInt(carList.size());
        return carList.get(item);
    }
}
