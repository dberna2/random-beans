package com.mercurytfs.mercury.common.test.util.randomizer.company.configuration;

import com.mercurytfs.mercury.common.test.util.randomizer.company.CompanyCityRandomizer;
import com.mercurytfs.mercury.common.test.util.randomizer.company.CompanyNameRandomizer;
import com.mercurytfs.mercury.core.base.business.beans.CompanyBeanBasic;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;

public class CompanyRandomizerConfiguration {

    public static EnhancedRandomBuilder buildCompanyRandomize(EnhancedRandomBuilder randomBuilder) {
        randomBuilder.randomize(FieldDefinitionBuilder.field().named("name").ofType(String.class).inClass(CompanyBeanBasic.class).get(), new CompanyNameRandomizer());
        randomBuilder.randomize(FieldDefinitionBuilder.field().named("city").ofType(String.class).inClass(CompanyBeanBasic.class).get(), new CompanyCityRandomizer());
        return randomBuilder;
    }
}
