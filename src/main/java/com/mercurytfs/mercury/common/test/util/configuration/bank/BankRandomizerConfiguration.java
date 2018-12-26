package com.mercurytfs.mercury.common.test.util.configuration.bank;

import com.mercurytfs.mercury.common.test.util.randomizer.bank.BankNameRandomizer;
import com.mercurytfs.mercury.core.base.business.beans.BankBeanBasic;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;

public class BankRandomizerConfiguration {

    public static EnhancedRandomBuilder buildBankRandomize(EnhancedRandomBuilder randomBuilder) {
        randomBuilder.randomize(FieldDefinitionBuilder.field().named("name").ofType(String.class).inClass(BankBeanBasic.class).get(), new BankNameRandomizer());
        return randomBuilder;
    }
}
