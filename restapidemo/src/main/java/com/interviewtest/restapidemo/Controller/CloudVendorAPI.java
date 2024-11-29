package com.interviewtest.restapidemo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewtest.restapidemo.model.CloudVendor;
import com.interviewtest.restapidemo.service.CloudAPIService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPI {
	
	CloudAPIService api;
	
	public CloudVendorAPI(CloudAPIService api)
	{
		this.api = api;
	}
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
		return api.getCloudVendordetails(vendorId);
	}
	
	@PostMapping
	public String createCloudVendor(@RequestBody CloudVendor vendor)
	{
		return api.createCloudVendor(vendor);
	}
	
	@PutMapping
	public String updatedCloudVendor(@RequestBody CloudVendor vendor)
	{
		return api.updateCloudVendor(vendor);
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendor(@PathVariable String vendorId)
	{
		return api.deleteCloudVendor(vendorId);
	}

}
