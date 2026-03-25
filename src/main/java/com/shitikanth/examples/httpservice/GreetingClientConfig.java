package com.shitikanth.examples.httpservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(group = "greeting", value = GreetingClient.class)
class GreetingClientConfig {
}
