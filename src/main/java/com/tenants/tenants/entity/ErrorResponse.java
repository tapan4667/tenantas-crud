package com.tenants.tenants.entity;

public class ErrorResponse {
private String message;
private int responseCode;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getResponseCode() {
	return responseCode;
}
public void setResponseCode(int responseCode) {
	this.responseCode = responseCode;
}

}
