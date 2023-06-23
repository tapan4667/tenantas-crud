package com.tenants.tenants.validator;

import org.springframework.stereotype.Component;

import com.tenants.tenants.entity.Tenants;
import com.tenants.tenants.exception.TenantsNotFoundException;
@Component("name")
public class TenantsNameValidator implements TenantsValidator{

	@Override
	public void validate(Tenants t) {
	if(t.getName().equals("")) {
		throw new TenantsNotFoundException("please enter a validate name");
	}	
	}

}
