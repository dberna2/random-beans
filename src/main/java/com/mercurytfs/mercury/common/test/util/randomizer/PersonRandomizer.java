package com.mercurytfs.mercury.common.test.util.randomizer;

import com.mercurytfs.mercury.common.test.util.dto.Person;
import io.github.benas.randombeans.api.Randomizer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class PersonRandomizer implements Randomizer<Person> {

    private Random random = new Random();

    @Override
    public Person getRandomValue() {
        return this.getPerson();
    }

    private Person getPerson(){
        List<Person> personList = Arrays.asList(
                new Person("Camila", 28, 123d),
                new Person("Stiven", 16, 124d),
                new Person("Jaime", 27, 125d)
        );
        Integer item = random.nextInt(personList.size());

        return personList.get(item);
    }
}
