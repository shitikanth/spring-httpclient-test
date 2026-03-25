package com.shitikanth.examples.httpservice;


import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.http.client.autoconfigure.service.HttpServiceClientPropertiesAutoConfiguration;
import org.springframework.boot.restclient.autoconfigure.service.HttpServiceClientAutoConfiguration;
import org.springframework.boot.restclient.test.autoconfigure.RestClientTest;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@RestClientTest
@ImportAutoConfiguration({HttpServiceClientPropertiesAutoConfiguration.class, HttpServiceClientAutoConfiguration.class})
public @interface HttpClientTest {
}
