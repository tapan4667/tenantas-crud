package com.tenants.tenants.validator;

import org.springframework.stereotype.Component;

import com.tenants.tenants.entity.Tenants;
import com.tenants.tenants.exception.TenantsNotFoundException;
@Component("flatno")
public class TenantsFlatNoValidator implements TenantsValidator{

	@Override
	public void validate(Tenants t) {
	if(t.getFlatNumber()==0) {
		throw new TenantsNotFoundException("please enter a valid flat Number");
	}
		
	}

}


