package fi.codecenter.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloServiceImpl {
	@GET
	@Produces("text/plain; charset=UTF-8")
	public String sayHello() {
		System.out.println("The server responds hello!");
		return "Hello!";
	}
}
