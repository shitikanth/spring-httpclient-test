package com.shitikanth.examples.httpservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.restclient.test.autoconfigure.RestClientTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest(GreetingClient.class)
@Import(GreetingClientConfig.class)
class GreetingClientTest {

	@Autowired
	GreetingClient client;

	@Autowired
	MockRestServiceServer server;

	@Test
	void greetingTest() {
		server.expect(requestTo("/greeting?name=World"))
			.andRespond(withSuccess("Hello World!", MediaType.TEXT_PLAIN));

		var response = client.getGreeting("World");

		server.verify();
		assertEquals("Hello World!", response);
	}
}