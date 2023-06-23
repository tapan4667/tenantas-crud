package com.tenants.tenants.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tenants {
	@Id
private String name;
private int id;
private int flatNumber;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getFlatNumber() {
	return flatNumber;
}
public void setFlatNumber(int flatNumber) {
	this.flatNumber = flatNumber;
}

}
