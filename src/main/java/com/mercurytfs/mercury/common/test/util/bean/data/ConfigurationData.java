package com.mercurytfs.mercury.common.test.util.bean.data;

import com.mercurytfs.mercury.common.test.util.util.JSONUtils;
import com.mercurytfs.mercury.common.test.util.util.MercuryRandom;

import java.util.List;

public abstract class ConfigurationData<T> {

    private static final MercuryRandom RANDOM = new MercuryRandom();

    protected abstract Class<T> getClassReference();

    protected List<T> buildData(){
        return JSONUtils.getListByClass(getClassReference());
    }

    protected T getRandomObject(){
        final List<T> resultData = buildData();
        return resultData.get(RANDOM.nextInt(resultData.size()));
    }
}
