package fi.codecenter.examples;

import javax.jws.WebService;

@WebService(endpointInterface = "fi.codecenter.examples.HelloService")
public class HelloServiceImpl implements HelloService {
	public String sayHello(String name) {
		String response = "Hello " + name + "!";
		System.out.printf("sayHello responds '%s'\n", response);
		return response;
	}
}
