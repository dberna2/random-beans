package com.mercurytfs.mercury.common.test.util.randomizer;

import com.mercurytfs.mercury.common.test.util.randomizer.bank.configuration.BankRandomizerConfiguration;
import com.mercurytfs.mercury.common.test.util.randomizer.company.configuration.CompanyRandomizerConfiguration;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

import static java.nio.charset.Charset.forName;

public final class EnhancedRandomConfig {

    public static EnhancedRandom buildEnhancedRandomConfiguration(){
        EnhancedRandomBuilder randomBuilder = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .charset(forName("UTF-8"))
                .randomizationDepth(5)
                .overrideDefaultInitialization(false)
                .scanClasspathForConcreteTypes (true)
                .collectionSizeRange(2, 5);
        return buildCustomRandomize(randomBuilder).build();

    }

    private static EnhancedRandomBuilder buildCustomRandomize(EnhancedRandomBuilder randomBuilder) {
        CompanyRandomizerConfiguration.buildCompanyRandomize(randomBuilder);
        BankRandomizerConfiguration.buildBankRandomize(randomBuilder);
        return randomBuilder;
    }
}