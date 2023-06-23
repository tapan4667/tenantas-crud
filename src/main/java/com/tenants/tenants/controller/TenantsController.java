package com.tenants.tenants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tenants.tenants.entity.Tenants;
import com.tenants.tenants.service.TenantsService;

@RestController
public class TenantsController {
	@Autowired
	TenantsService ts;
	@Autowired
	TenantsValidationController tv;

	@PostMapping("/Tenants")
	public Tenants insertNewTenants(@RequestBody Tenants t) {
		tv.validate(t);
		return ts.insertNewTenants(t);
	}

	@PutMapping("/Tenants")
	public Tenants updateTenants(@RequestBody Tenants t) {
		tv.validate(t);
		return ts.updateTenants(t);
	}

	@DeleteMapping("/Tenants")
	public void deleteById(@RequestParam int id) {
		ts.deleteById(id);
	}

	@GetMapping("/Tenants")
	public List<Tenants> getAllTenants() {
		return ts.getAllTenants();
	}
}
