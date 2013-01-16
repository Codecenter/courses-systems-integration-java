package fi.codecenter.examples;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * This example uses JAX-WS annotations to specify what kind of interface we
 * want the web service to have.
 */
@WebService
public interface HelloService {
	String sayHello(@WebParam(name = "name") String name);
}
