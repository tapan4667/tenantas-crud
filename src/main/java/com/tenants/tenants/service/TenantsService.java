package com.tenants.tenants.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenants.tenants.entity.Tenants;
import com.tenants.tenants.repository.TenantsRepository;
@Service
public class TenantsService {
	@Autowired
	TenantsRepository tr;

public Tenants insertNewTenants(Tenants t) {
  return tr.save(t);
}
public Tenants updateTenants(Tenants t) {
	Optional<Tenants> op=tr.findById(t.getId());
	Tenants tn=op.get();
	tn.setName(t.getName());
tn.setFlatNumber(t.getFlatNumber());
tr.save(tn);
return tn;
}
public void deleteById(int id) {
	tr.deleteById(id);
}
public List<Tenants> getAllTenants(){
	List<Tenants> li=new ArrayList<>();
 Iterable<Tenants> it=tr.findAll();
 for(Tenants t:it) {
	 li.add(t);
 }
 return li;
}
}
