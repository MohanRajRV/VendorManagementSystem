package com.api.jpa.restapi_jpa.service;

import java.util.List;

import com.api.jpa.restapi_jpa.model.Vendor;

public interface VendorService {
 public String createcloudVendor(Vendor vendor);
 public String updateCloudVendor(Vendor vendor);
 public Vendor getCloudVendor(Integer id);
 public List<Vendor> getALlVendors();
 public String deleteVendor(Integer id);
 
 
}
