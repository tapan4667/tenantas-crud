package com.tenants.tenants.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tenants.tenants.entity.Tenants;
@Repository
public interface TenantsRepository extends CrudRepository<Tenants, Integer>{

}
