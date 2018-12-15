package com.mercurytfs.mercury.common.test.util.configuration.randomizer;

import com.mercurytfs.mercury.common.test.util.dto.Person;
import java.util.function.Supplier;

public class PersonRandomizer implements Supplier<Person> {

    @Override
    public Person get() {
        Person person = new Person();
        person.setAge(27);
        return person;
    }
}
