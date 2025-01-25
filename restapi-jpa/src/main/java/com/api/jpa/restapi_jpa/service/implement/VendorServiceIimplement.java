package com.api.jpa.restapi_jpa.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.jpa.restapi_jpa.exception.VendorNotFoundException;
import com.api.jpa.restapi_jpa.model.Vendor;
import com.api.jpa.restapi_jpa.repository.CloudRepository;
import com.api.jpa.restapi_jpa.service.VendorService;

@Service
public class VendorServiceIimplement implements VendorService {

    @Autowired
    private CloudRepository cloudrepository;

    @Override
    public String createcloudVendor(Vendor vendor) {
        cloudrepository.save(vendor);
        return "VENDOR IS CREATED";
    }

    @Override
    public String updateCloudVendor(Vendor vendor) {
        cloudrepository.save(vendor);
        return "VENDOR IS UPDATED";
    }

    @Override
    public Vendor getCloudVendor(Integer id) {
    	if(cloudrepository.findById(id).isEmpty()) {
    		throw new VendorNotFoundException("VENDOR IS NOT FOUND");
    	}
        return cloudrepository.findById(id).get();
    }

    @Override
    public List<Vendor> getALlVendors() {
        return cloudrepository.findAll();
    }

    @Override
    public String deleteVendor(Integer id) {
        cloudrepository.deleteById(id);
        return "deleted successfully";
    }
}