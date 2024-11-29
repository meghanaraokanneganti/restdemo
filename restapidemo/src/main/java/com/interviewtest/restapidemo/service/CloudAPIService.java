package com.interviewtest.restapidemo.service;

import java.util.List;

import com.interviewtest.restapidemo.model.CloudVendor;

public interface CloudAPIService {

	public String createCloudVendor(CloudVendor vendor);
	public String updateCloudVendor(CloudVendor vendor);
	public CloudVendor getCloudVendordetails(String vendorID);
	public String deleteCloudVendor(String vendorID);
	public List<CloudVendor> getAllVendorDetails();
	
}
