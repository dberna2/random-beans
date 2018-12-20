package com.mercurytfs.mercury.common.test.util.configuration;

import com.mercurytfs.mercury.common.test.util.randomizer.CarRandomizer;
import com.mercurytfs.mercury.common.test.util.randomizer.PersonRandomizer;
import com.mercurytfs.mercury.common.test.util.dto.Car;
import com.mercurytfs.mercury.common.test.util.dto.Person;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

import static java.nio.charset.Charset.forName;

public final class EnhancedRandomConfig {

    public static EnhancedRandom buildEnhancedRandomConfiguration(){
        return  EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .seed(123L)
                .objectPoolSize(10)
                .charset(forName("UTF-8"))
                .randomizationDepth(3)
                .randomize(Person.class, new PersonRandomizer())
                .randomize(Car.class, new CarRandomizer())
                .overrideDefaultInitialization(false)
                .scanClasspathForConcreteTypes (true)
                .collectionSizeRange(1,3)
                .build();
    }
}