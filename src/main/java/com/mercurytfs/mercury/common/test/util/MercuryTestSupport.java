package com.mercurytfs.mercury.common.test.util;

import com.mercurytfs.mercury.common.test.util.configuration.EnhancedRandomConfig;
import com.mercurytfs.mercury.common.test.util.dto.Person;
import org.easymock.EasyMockSupport;

import java.util.List;
import java.util.stream.Collectors;

public class MercuryTestSupport extends EasyMockSupport {

    public static void main(String[] args){

        final Person person = new MercuryTestSupport().getObjectByClassReference(Person.class);
       // final List<Person> person = new MercuryTestSupport().getListByClassReference(Person.class, 13, "age");

        System.out.print(person);
    }

    protected <T> T getObjectByClassReference(Class<T>  classToGenerate, String... excludeFields){
        return EnhancedRandomConfig.buildEnhancedRandomConfiguration().nextObject(classToGenerate, excludeFields);
    }

    protected <T> List<T> getListByClassReference(Class<T>  classToGenerate, int elementTogenerate, String... excludeFields){
        return EnhancedRandomConfig.buildEnhancedRandomConfiguration().objects(classToGenerate, elementTogenerate, excludeFields)
                .collect(Collectors.toList());
    }


}
