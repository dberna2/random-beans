package com.mercurytfs.mercury.common.test.util.bean.data.bank;

import com.mercurytfs.mercury.common.test.util.bean.data.ConfigurationData;
import com.mercurytfs.mercury.core.base.business.beans.BankBeanBasic;

public class Bank extends ConfigurationData<BankBeanBasic> {

    private static BankBeanBasic bank = null;

    protected String getBankName(){
        bank = getRandomObject();
        return bank.getName();
    }

    protected String getBankAddress1(){
        return bank.getAddress1();
    }

    protected String getBankAddress2(){
        return bank.getAddress2();
    }

    @Override
    protected  Class<BankBeanBasic> getClassReference() {
        return BankBeanBasic.class;
    }
}
