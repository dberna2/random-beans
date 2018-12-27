package com.mercurytfs.mercury.common.test.util;

import com.mercurytfs.mercury.core.base.business.beans.BankBeanBasic;
import com.mercurytfs.mercury.core.base.business.beans.CompanyBeanBasic;

public class Ejemplo {

    private String name;
    private CompanyBeanBasic companyBeanBasic;
    private BankBeanBasic bankBeanBasic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyBeanBasic getCompanyBeanBasic() {
        return companyBeanBasic;
    }

    public void setCompanyBeanBasic(CompanyBeanBasic companyBeanBasic) {
        this.companyBeanBasic = companyBeanBasic;
    }

    public BankBeanBasic getBankBeanBasic() {
        return bankBeanBasic;
    }

    public void setBankBeanBasic(BankBeanBasic bankBeanBasic) {
        this.bankBeanBasic = bankBeanBasic;
    }
}
