package com.api.jpa.restapi_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.jpa.restapi_jpa.model.Vendor;

@Repository
public interface CloudRepository extends JpaRepository<Vendor,Integer> {

	
}
