package com.mercurytfs.mercury.common.test.util;

import com.mercurytfs.mercury.common.test.util.context.MercuryContextSupport;
import com.mercurytfs.mercury.common.test.util.randomizer.EnhancedRandomConfig;
import com.mercurytfs.mercury.core.base.business.beans.BankBeanBasic;
import com.mercurytfs.mercury.core.base.service.dto.UserTypeDTO;
import org.easymock.EasyMockSupport;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;
import java.util.stream.Collectors;

public class MercuryTestSupport extends EasyMockSupport {

    public static void main(String[] args){

        final BankBeanBasic objectByClassReference = new MercuryTestSupport().getObjectByClassReference(BankBeanBasic.class);
        System.out.println(objectByClassReference.getName());
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
