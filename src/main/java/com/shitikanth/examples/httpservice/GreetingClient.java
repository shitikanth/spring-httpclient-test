package com.shitikanth.examples.httpservice;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

interface GreetingClient {
	@GetExchange("/greeting")
	String getGreeting(@RequestParam String name);
}
