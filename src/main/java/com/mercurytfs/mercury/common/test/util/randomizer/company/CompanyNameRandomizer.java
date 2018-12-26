package com.mercurytfs.mercury.common.test.util.randomizer.company;

import com.mercurytfs.mercury.common.test.util.bean.data.company.Company;
import io.github.benas.randombeans.api.Randomizer;

public class CompanyNameRandomizer extends Company implements Randomizer<String> {

    @Override
    public String getRandomValue() {
        return getCompanyName();
    }
}
