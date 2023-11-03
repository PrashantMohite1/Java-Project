package com.firstproject.restapidemo.model;

public class CloudVendor {
	
	
	private String vendorID;
	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}

	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	
	public CloudVendor(){
		
	}
	
	public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	
	

}
