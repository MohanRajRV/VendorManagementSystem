package com.api.jpa.restapi_jpa.resposen;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomResposnse {
  public static ResponseEntity<Object> responseFunc(String msg,
		  HttpStatus status,
		  Object FinalResult){
	  Map<String,Object>respon = new HashMap<>();
	   respon.put("message", msg);
	   respon.put("HTTP STATUS",status);
	   respon.put("data",FinalResult);
	   
	   return new ResponseEntity<>(respon,status);
  }
}
