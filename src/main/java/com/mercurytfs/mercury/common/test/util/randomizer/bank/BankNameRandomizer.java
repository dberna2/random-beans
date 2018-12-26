package com.mercurytfs.mercury.common.test.util.randomizer.bank;

import com.mercurytfs.mercury.common.test.util.bean.data.bank.Bank;
import io.github.benas.randombeans.api.Randomizer;

public class BankNameRandomizer extends Bank implements Randomizer<String> {

    @Override
    public String getRandomValue() {
        return getBankyName();
    }
}
