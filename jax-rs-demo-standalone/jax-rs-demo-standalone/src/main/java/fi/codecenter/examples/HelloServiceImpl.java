package fi.codecenter.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloServiceImpl implements HelloService {
	@GET
	@Produces("text/plain; charset=UTF-8")
	public String sayHello() {
		return "Hello!";
	}
}
