package com.api.jpa.restapi_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.jpa.restapi_jpa.model.Vendor;
import com.api.jpa.restapi_jpa.resposen.CustomResposnse;
import com.api.jpa.restapi_jpa.service.VendorService;


@RestController
@RequestMapping("/vendors")
public class CloudVendorAPIService {
	@Autowired
	VendorService vedorservice;
	
	
	
	
		
		public CloudVendorAPIService() {
		super();
	}


		public CloudVendorAPIService(VendorService vedorservice) {
	
		this.vedorservice = vedorservice;
	}


		@GetMapping("/{vendorId}")
		public String getVendorInfo(@PathVariable("vendorId") int id) {
			
			//return CustomResposnse.responseFunc("REQUESTED VENDOR DETAIL",HttpStatus.OK,vedorservice.getCloudVendor(id));
		  //ResponseEntity<Object>
		  return "employee id nigga found"+id;
		    
		}
		
		
		@PostMapping
		public String  postVendorInfo(@RequestBody Vendor c) {
		      return vedorservice.createcloudVendor(c);
		}
		@PutMapping
		public String  VendorInfo(@RequestBody Vendor c) {
		    return vedorservice.updateCloudVendor(c);
		}

	
	@DeleteMapping("/{id}")
	public String deleteVendor(@PathVariable("id")int id) {
		 return vedorservice.deleteVendor(id);
	}
	@GetMapping
	public List<Vendor> allCloudVendor(){
		return vedorservice.getALlVendors();
	}
	
}
