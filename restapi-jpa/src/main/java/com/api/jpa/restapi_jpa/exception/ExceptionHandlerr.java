package com.api.jpa.restapi_jpa.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ExceptionHandlerr {
	
	
@ExceptionHandler(value = {VendorNotFoundException.class})
  public ResponseEntity<Object> handleCloudeVendornotfoud(VendorNotFoundException obj ){
	 VendoreException vendorexception = new  VendoreException(obj.getMessage(),obj.getCause(),HttpStatus.NOT_FOUND);
     return new  ResponseEntity<>(vendorexception,HttpStatus.NOT_FOUND);
  }
}
