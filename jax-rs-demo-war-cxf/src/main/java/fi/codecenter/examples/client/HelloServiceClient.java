package fi.codecenter.examples.client;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import fi.codecenter.examples.HelloService;

public class HelloServiceClient {
	public static void main(String[] args) throws Exception {
		// Obtain implementation, this client only sees the interface.
		HelloService hello = createHelloService();
        
		// Use the interface as usual to access the functionality.
        System.out.println(hello.sayHello());
	}
	
	protected static HelloService createHelloService() throws Exception {
		String serviceURL = "http://localhost:8080/jax-rs-demo-war-cxf/rest/helloApp";
		return JAXRSClientFactory.create(serviceURL, HelloService.class);		
	}
}
