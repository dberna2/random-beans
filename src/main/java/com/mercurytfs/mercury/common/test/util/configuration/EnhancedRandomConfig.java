package com.mercurytfs.mercury.common.test.util.configuration;

import com.mercurytfs.mercury.common.test.util.configuration.randomizer.CarRandomizer;
import com.mercurytfs.mercury.common.test.util.configuration.randomizer.PersonRandomizer;
import com.mercurytfs.mercury.common.test.util.dto.Car;
import com.mercurytfs.mercury.common.test.util.dto.Person;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

import static java.nio.charset.Charset.forName;

public final class EnhancedRandomConfig {

    public static EnhancedRandom buildEnhancedRandomConfiguration(){

        return  EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .seed(123L)
                .objectPoolSize(100)
                .randomizationDepth(3)
                .charset(forName("UTF-8"))
                .randomizationDepth(7)
                .randomize(Person.class, new PersonRandomizer())
                .randomize(Car.class, new CarRandomizer())
                .overrideDefaultInitialization(true)
                .build();
    }
}
