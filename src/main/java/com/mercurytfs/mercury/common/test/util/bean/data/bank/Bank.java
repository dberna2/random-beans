package com.mercurytfs.mercury.common.test.util.bean.data.bank;

import com.mercurytfs.mercury.common.test.util.util.MercuryRandom;
import com.mercurytfs.mercury.core.base.business.beans.BankBeanBasic;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static final MercuryRandom RANDOM = new MercuryRandom();

    protected String getBankyName(){
        Integer arraySize = buildCompanies().size();
        return buildCompanies().get(RANDOM.nextInt(arraySize)).getName();
    }

    private List<BankBeanBasic> buildCompanies(){

        List<BankBeanBasic> companyList = new ArrayList<>();

        BankBeanBasic beanBasic = new BankBeanBasic();
        beanBasic.setId(RANDOM.nextInt());
        beanBasic.setCity("Madrid");
        beanBasic.setName("Example");

        companyList.add(beanBasic);

        beanBasic = new BankBeanBasic();
        beanBasic.setId(RANDOM.nextInt());
        beanBasic.setCity("Lima");
        beanBasic.setName("Example2");

        companyList.add(beanBasic);

        return companyList;
    }
}
