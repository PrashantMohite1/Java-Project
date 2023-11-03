package com.firstproject.restapidemo.controller;

import com.firstproject.restapidemo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.model.CloudVendor;


@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	
	@GetMapping({"vendorID"})
	public CloudVendor getCloudVendorDetails(String vendorID) {
		return new CloudVendor ("C1","Vendor 1","address one ", "996050xxxx");
	}

}
