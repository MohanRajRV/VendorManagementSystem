package com.api.jpa.restapi_jpa.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class DummyClass implements HealthIndicator {

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		return null;
	}
  
}
