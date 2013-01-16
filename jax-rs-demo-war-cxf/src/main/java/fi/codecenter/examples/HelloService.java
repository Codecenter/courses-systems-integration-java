package fi.codecenter.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public interface HelloService {
	@GET
	@Produces("text/plain; charset=UTF-8")
	String sayHello();
}
