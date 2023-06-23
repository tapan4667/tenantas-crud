package com.tenants.tenants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tenants.tenants.entity.Tenants;
import com.tenants.tenants.validator.TenantsValidator;
@Component
public class TenantsValidationController {
@Autowired	
@Qualifier("name")
TenantsValidator name;
@Autowired
@Qualifier("flatno")
TenantsValidator flatno;

public void validate(Tenants t) {
	name.validate(t);
	flatno.validate(t);
}

}
