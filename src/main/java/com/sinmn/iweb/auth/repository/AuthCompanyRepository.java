package com.sinmn.iweb.auth.repository;

import org.springframework.stereotype.Repository;

import com.sinmn.core.model.annotation.ModelAutowired;
import com.sinmn.core.model.core.AbstractModelRepository;
import com.sinmn.core.model.core.Model;
import com.sinmn.iweb.auth.model.AuthCompany;

@Repository
public class AuthCompanyRepository extends AbstractModelRepository<AuthCompany>{

	@ModelAutowired
	private Model<AuthCompany> authCompanyModel;
	
	@Override
	protected Model<AuthCompany> getModel() {
		return authCompanyModel;
	}
}
