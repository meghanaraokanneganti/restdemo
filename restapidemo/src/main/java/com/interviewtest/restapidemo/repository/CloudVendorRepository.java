package com.interviewtest.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewtest.restapidemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
	


}
