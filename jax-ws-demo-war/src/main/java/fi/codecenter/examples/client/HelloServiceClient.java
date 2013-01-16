package fi.codecenter.examples.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fi.codecenter.examples.HelloService;

public class HelloServiceClient {
	public static void main(String[] args) throws Exception {
		// Obtain implementation
		HelloService hello = createHelloService();
        
		// Use the implementation
        System.out.println(hello.sayHello("Thomas"));
	}
	
	protected static HelloService createHelloService() throws Exception {
		// Specify location of the WSDL as an URL.
		URL url = new URL("http://localhost:8080/jax-ws-demo-war/ws/HelloService?wsdl");
		 
		// Identify the service.
        QName qname = new QName("http://codecenter.fi/examples/ws", "HelloService");
 
        // Create a Service instance used to generate a Java proxy 
        // for our interface.
        Service service = Service.create(url, qname);
        return service.getPort(HelloService.class);
	}
}
