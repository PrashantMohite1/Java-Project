package com.firstproject.restapidemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.firstproject.restapidemo.controller.CloudAPIService;
import com.firstproject.restapidemo.model.CloudVendor;

public class CloudAPIServiceTest {

    private CloudAPIService cloudAPIService;

    @Before
    public void setUp() {
        cloudAPIService = new CloudAPIService();
    }

    @Test
    public void testGetCloudVendorDetails() {
        // Arrange
        CloudVendor expectedVendor = new CloudVendor("C1", "Vendor 1", "Address One", "996050xxxx");
        cloudAPIService.mPrashant = expectedVendor;

        // Act
        CloudVendor result = cloudAPIService.getCloudVendorDetails("C22");

        // Assert
        assertNotEquals(expectedVendor, result);
    }

    @Test
    public void testCreateCloudVendorDetails() {
        // Arrange
        CloudVendor newVendor = new CloudVendor("C2", "Vendor 2", "Address Two", "1234567890");

        // Act
        String result = cloudAPIService.createCloudVendorDetails(newVendor);

        // Assert
        assertEquals("cloudvendor updated succesfully", result);
        assertEquals(newVendor, cloudAPIService.mPrashant);
    }

    @Test
    public void testUpdateCloudVendorDetails() {
        // Arrange
        CloudVendor updatedVendor = new CloudVendor("C1", "Updated Vendor", "Updated Address", "9876543210");

        // Act
        String result = cloudAPIService.updateCloudVendorDetails(updatedVendor);

        // Assert
        assertEquals("cloudvendor updated succesfully", result);
        assertEquals(updatedVendor, cloudAPIService.mPrashant);
    }

    @Test
    public void testGetCloudVendorDetails1() {
        // Arrange
        CloudVendor expectedVendor = new CloudVendor("C1", "Vendor 1", "Address One", "996050xxxx");
        cloudAPIService.mPrashant = expectedVendor;

        // Act
        CloudVendor result = cloudAPIService.getCloudVendorDetails("C2"); // Incorrect vendor ID

        // Assert
        assertNotEquals(expectedVendor, result); // Assert that the returned vendor does not match the expected vendor
    }
}
