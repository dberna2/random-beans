package com.mercurytfs.mercury.common.test.util.bean.data.company;

import com.mercurytfs.mercury.common.test.util.util.MercuryRandom;
import com.mercurytfs.mercury.core.base.business.beans.CompanyBeanBasic;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private static final MercuryRandom RANDOM = new MercuryRandom();

    protected String getCompanyName(){
        Integer arraySize = buildCompanies().size();
        return buildCompanies().get(RANDOM.nextInt(arraySize)).getName();
    }

    protected String getCompanyCity(){
        Integer arraySize = buildCompanies().size();
        return buildCompanies().get(RANDOM.nextInt(arraySize)).getCity();
    }

    private List<CompanyBeanBasic> buildCompanies(){

        List<CompanyBeanBasic> companyList = new ArrayList<>();

        CompanyBeanBasic beanBasic = new CompanyBeanBasic();
        beanBasic.setId(RANDOM.nextInt());
        beanBasic.setCity("BOGOTA");
        beanBasic.setName("Example");

        companyList.add(beanBasic);

        beanBasic = new CompanyBeanBasic();
        beanBasic.setId(RANDOM.nextInt());
        beanBasic.setCity("SPAIN");
        beanBasic.setName("Example2");

        companyList.add(beanBasic);

        return companyList;
    }
}
