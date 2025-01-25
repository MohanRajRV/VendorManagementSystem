package com.api.jpa.restapi_jpa.exception;

import org.springframework.http.HttpStatus;

public class VendoreException {
  final String mesagge;
  final Throwable throwable;
  final HttpStatus status;
public VendoreException(String mesagge, Throwable throwable, HttpStatus status) {
	super();
	this.mesagge = mesagge;
	this.throwable = throwable;
	this.status = status;
}
public String getMesagge() {
	return mesagge;
}
public Throwable getThrowable() {
	return throwable;
}
public HttpStatus getStatus() {
	return status;
}
  
}
