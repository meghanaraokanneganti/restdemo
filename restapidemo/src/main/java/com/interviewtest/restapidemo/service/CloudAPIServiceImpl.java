package com.interviewtest.restapidemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.interviewtest.restapidemo.model.CloudVendor;
import com.interviewtest.restapidemo.repository.CloudVendorRepository;

@Service
public class CloudAPIServiceImpl implements CloudAPIService{

	CloudVendorRepository repo;
	
	public CloudAPIServiceImpl(CloudVendorRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String createCloudVendor(CloudVendor vendor) {
		repo.save(vendor);
		return "Created successfully";
	}

	@Override
	public String updateCloudVendor(CloudVendor vendor) {
		repo.save(vendor);
		return "Updated successfully";
	}

	@Override
	public CloudVendor getCloudVendordetails(String vendorID) {
		return repo.findById(vendorID).get();
	}

	@Override
	public String deleteCloudVendor(String vendorID) {
		repo.deleteById(vendorID);
		return null;
	}

	@Override
	public List<CloudVendor> getAllVendorDetails() {
		return repo.findAll();
	}

}
