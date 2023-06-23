package com.tenants.tenants.lobalexceptionhendler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tenants.tenants.entity.ErrorResponse;
import com.tenants.tenants.exception.TenantsNotFoundException;

@ControllerAdvice
public class lobalexceptionhendler {
@ExceptionHandler(TenantsNotFoundException.class)
public ErrorResponse getMessae(TenantsNotFoundException t) {
	ErrorResponse er=new ErrorResponse();
	er.setMessage(t.getMessage());
	er.setResponseCode(200);
return er;
}

}
