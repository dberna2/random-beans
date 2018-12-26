package com.mercurytfs.mercury.common.test.util;

import com.mercurytfs.mercury.common.test.util.configuration.EnhancedRandomConfig;
import com.mercurytfs.mercury.common.test.util.context.MercuryContextSupport;
import com.mercurytfs.mercury.common.test.util.randomizer.Ejemplo;
import com.mercurytfs.mercury.core.base.service.dto.UserTypeDTO;
import org.easymock.EasyMockSupport;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;
import java.util.stream.Collectors;

public class MercuryTestSupport extends EasyMockSupport {

    public static void main(String[] args){

        final Ejemplo person = new MercuryTestSupport().getObjectByClassReference(Ejemplo.class);
        //final Ejemplo2 person = new MercuryTestSupport().getObjectByClassReference(Ejemplo2.class);
        //final List<Ejemplo2> person = new MercuryTestSupport().getListByClassReference(Ejemplo2.class, 4);

        System.out.print(person.getBankBeanBasic().getName() + " - " + person.getBankBeanBasic().getCity());

        //person.getBankBeanBasic().forEach(i -> System.out.println(i.getName() + " - " + i.getCity() ));

        //person.forEach(item -> item.getCompanyBeanBasic().forEach(i -> System.out.println(i.getName() + " - " + i.getCity() )));
    }

    protected <T> T getObjectByClassReference(Class<T>  classToGenerate, String... excludeFields){
        return EnhancedRandomConfig.buildEnhancedRandomConfiguration().nextObject(classToGenerate, excludeFields);
    }

    protected <T> List<T> getListByClassReference(Class<T>  classToGenerate, int elementTogenerate, String... excludeFields){
        return EnhancedRandomConfig.buildEnhancedRandomConfiguration().objects(classToGenerate, elementTogenerate, excludeFields)
                .collect(Collectors.toList());
    }

    protected void createCorpUserContext() {
        SecurityContextImpl secureContext = new SecurityContextImpl();
        secureContext.setAuthentication(new MercuryContextSupport(UserTypeDTO.CORP_USER));
        SecurityContextHolder.setContext(secureContext);
    }

    protected void createBankUserContext() {
        SecurityContextImpl secureContext = new SecurityContextImpl();
        secureContext.setAuthentication(new MercuryContextSupport(UserTypeDTO.BANK_USER));
        SecurityContextHolder.setContext(secureContext);
    }

    protected <T> T invokePrivateMethod(Class classToTest, String methodName, Object... args){
        try {
            return ReflectionTestUtils.invokeMethod(classToTest, methodName, args);
        }catch (Exception e){
            throw e;
        }
    }
}
