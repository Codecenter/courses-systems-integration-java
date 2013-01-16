package fi.codecenter.examples.server;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;

public class HelloServiceServer {
	public static void main(String[] args) throws Exception {
		// Start the server using Jersey API
		HttpServerFactory.create("http://localhost:9998/ws").start();
	}
}
