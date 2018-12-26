package com.mercurytfs.mercury.common.test.util.configuration;

import com.mercurytfs.mercury.common.test.util.configuration.bank.BankRandomizerConfiguration;
import com.mercurytfs.mercury.common.test.util.configuration.company.CompanyRandomizerConfiguration;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

import static java.nio.charset.Charset.forName;

public final class EnhancedRandomConfig {

    public static EnhancedRandom buildEnhancedRandomConfiguration(){
        EnhancedRandomBuilder randomBuilder = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .seed(123L)
                .objectPoolSize(10)
                .charset(forName("UTF-8"))
                .randomizationDepth(3)
                .overrideDefaultInitialization(false)
                .scanClasspathForConcreteTypes (true)
                .collectionSizeRange(1,3);
        return buildCustomRandomize(randomBuilder).build();

    }

    private static EnhancedRandomBuilder buildCustomRandomize(EnhancedRandomBuilder randomBuilder) {
        CompanyRandomizerConfiguration.buildCompanyRandomize(randomBuilder);
        BankRandomizerConfiguration.buildBankRandomize(randomBuilder);
        return randomBuilder;
    }
}