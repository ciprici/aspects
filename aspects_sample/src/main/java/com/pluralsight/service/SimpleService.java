package com.pluralsight.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

	public String doSomething() {
		return "My simple service";
	}

	public String throwException() throws RuntimeException {
		throw new RuntimeException("my personal runtime exception");
	}

}
