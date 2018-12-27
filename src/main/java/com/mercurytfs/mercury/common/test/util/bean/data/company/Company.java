package com.mercurytfs.mercury.common.test.util.bean.data.company;

import com.mercurytfs.mercury.common.test.util.bean.data.ConfigurationData;
import com.mercurytfs.mercury.common.test.util.util.JSONUtils;
import com.mercurytfs.mercury.common.test.util.util.MercuryRandom;
import com.mercurytfs.mercury.core.base.business.beans.CompanyBeanBasic;

import java.util.ArrayList;
import java.util.List;

public class Company extends ConfigurationData<CompanyBeanBasic>{

    private static CompanyBeanBasic company = null;

    protected String getCompanyName(){
        company = getRandomObject();
        return company.getName();
    }

    protected String getCompanyCity(){
        return company.getCity();
    }

    @Override
    protected Class<CompanyBeanBasic> getClassReference() {
        return CompanyBeanBasic.class;
    }
}
