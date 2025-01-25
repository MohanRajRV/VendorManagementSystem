package com.api.jpa.restapi_jpa.exception;

public class VendorNotFoundException extends RuntimeException {



	public VendorNotFoundException(String message) {
        super(message);
    }
	 public VendorNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	
	
}
