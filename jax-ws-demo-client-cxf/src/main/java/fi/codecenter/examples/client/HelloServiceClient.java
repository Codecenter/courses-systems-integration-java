package fi.codecenter.examples.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.codecenter.examples.HelloService;

public class HelloServiceClient {
	public static void main(String[] args) throws Exception {
		// Obtain implementation, this client only sees the interface.
		HelloService hello = createHelloService();
        
		// Use the interface as usual to access the functionality.
        System.out.println(hello.sayHello("Thomas"));
	}
	
	protected static HelloService createHelloService() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/fi/codecenter/examples/client/applicationContext.xml");
        return (HelloService)context.getBean("helloService");
	}
}
