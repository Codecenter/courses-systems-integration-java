package fi.codecenter.examples.server;

import javax.xml.ws.Endpoint;

import fi.codecenter.examples.HelloServiceImpl;

public class HelloServiceServer {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloServiceImpl());
	}
}
