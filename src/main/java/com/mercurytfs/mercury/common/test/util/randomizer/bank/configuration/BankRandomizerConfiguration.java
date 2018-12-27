package com.mercurytfs.mercury.common.test.util.randomizer.bank.configuration;

import com.mercurytfs.mercury.common.test.util.randomizer.bank.BankAddress1Randomizer;
import com.mercurytfs.mercury.common.test.util.randomizer.bank.BankAddress2Randomizer;
import com.mercurytfs.mercury.common.test.util.randomizer.bank.BankNameRandomizer;
import com.mercurytfs.mercury.core.base.business.beans.BankBeanBasic;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;

public class BankRandomizerConfiguration {

    public static EnhancedRandomBuilder buildBankRandomize(EnhancedRandomBuilder randomBuilder) {
        randomBuilder.randomize(FieldDefinitionBuilder.field().named("name").ofType(String.class).inClass(BankBeanBasic.class).get(), new BankNameRandomizer());
        randomBuilder.randomize(FieldDefinitionBuilder.field().named("address1").ofType(String.class).inClass(BankBeanBasic.class).get(), new BankAddress1Randomizer());
        randomBuilder.randomize(FieldDefinitionBuilder.field().named("address2").ofType(String.class).inClass(BankBeanBasic.class).get(), new BankAddress2Randomizer());

        return randomBuilder;
    }
}
