package com.firstproject.restapidemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.restapidemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	
	// created cloudvendor object
	
	CloudVendor mPrashant;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorID) {
		
		return mPrashant;
//		return new CloudVendor ("C1","Vendor 1","address one ", "996050xxxx");
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor mPrashant) {
		this.mPrashant = mPrashant;
		return "cloudvendor updated succesfully";
		
	}
	
	
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor mPrashant) {
		this.mPrashant = mPrashant;
		return "cloudvendor updated succesfully";
		
	}
	
	
//	@DeleteMapping("{/vendorId}")
//	public String deleteCloudVendorDetails(String vendorId) {
//		this.mPrashant = null;
//		return "cloudvendor deleted succesfully";
//		
//	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails( String vendorId) {
	    // Implement deletion logic here
	    this.mPrashant = null;
	    return "cloudvendor deleted successfully";
	}

	
	
	

}
