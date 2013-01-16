package fi.codecenter.examples.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import fi.codecenter.examples.HelloService;

public class HelloServiceClient {
	public static void main(String[] args) throws Exception {
		// Obtain implementation
		HelloService hello = createHelloService();

		// Use the implementation
		System.out.println(hello.sayHello());
	}

	protected static HelloService createHelloService() throws Exception {
		return new HelloServiceProxy("http://localhost:8080/jax-rs-demo-war/rest");
	}
}

class HelloServiceProxy implements HelloService {
	private WebResource service;
	public static final String PATH_HELLO = "/hello";

	public HelloServiceProxy(String url) {
		ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        service = client.resource(url);
	}

	public String sayHello() {
		return service.path(PATH_HELLO).accept(
				MediaType.TEXT_PLAIN).get(String.class);
	}
}