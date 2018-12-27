package com.mercurytfs.mercury.common.test.util;

import com.mercurytfs.mercury.core.base.business.beans.BankBeanBasic;
import com.mercurytfs.mercury.core.base.business.beans.CompanyBeanBasic;

import java.util.List;

public class Ejemplo2 {

    private String name;
    private List<CompanyBeanBasic> companyBeanBasic;
    private List<BankBeanBasic> bankBeanBasic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CompanyBeanBasic> getCompanyBeanBasic() {
        return companyBeanBasic;
    }

    public void setCompanyBeanBasic(List<CompanyBeanBasic> companyBeanBasic) {
        this.companyBeanBasic = companyBeanBasic;
    }

    public List<BankBeanBasic> getBankBeanBasic() {
        return bankBeanBasic;
    }

    public void setBankBeanBasic(List<BankBeanBasic> bankBeanBasic) {
        this.bankBeanBasic = bankBeanBasic;
    }
}
