package com.mercurytfs.mercury.common.test.util.context;

import java.util.Collection;
import java.util.Locale;

import com.mercurytfs.mercury.core.base.security.MercuryUser;
import com.mercurytfs.mercury.core.base.service.dto.BankDTO;
import com.mercurytfs.mercury.core.base.service.dto.CompanyDTO;
import com.mercurytfs.mercury.core.base.service.dto.UserTypeDTO;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class MercuryContextSupport implements Authentication {

	private String userTypeName;

	public MercuryContextSupport(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {}

	@Override
	public boolean isAuthenticated() {
		return true;
	}

	@Override
	public Object getPrincipal() {
		MercuryUser mercuryUser = new MercuryUser();
		mercuryUser.setUserId(123);
		mercuryUser.setType(buildUserTypeDTO());
		mercuryUser.setLocale(Locale.ENGLISH);
		mercuryUser.setActiveCompany(buildActiveCompanyDTO());
		mercuryUser.setActiveBank(buildActiveBank());
		return mercuryUser;
	}

	@Override
	public Object getDetails() {
		return null;
	}

	@Override
	public Object getCredentials() {
		return null;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	private CompanyDTO buildActiveCompanyDTO() {
		CompanyDTO companyDto = new CompanyDTO();
		companyDto.setId(123);
		companyDto.setName("Test Company");
		companyDto.setCity("Spain");
		return companyDto;
	}

	private UserTypeDTO buildUserTypeDTO() {
		UserTypeDTO userType = new UserTypeDTO();
		userType.setName(this.userTypeName);
		return userType;
	}

	private BankDTO buildActiveBank() {
		BankDTO bankDto = new BankDTO();
		bankDto.setId(123);
		bankDto.setName("Bank Of Spain");
		bankDto.setCity("Spain");
		return bankDto;
	}
}
