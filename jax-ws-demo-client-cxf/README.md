Using Apache CXF as the JAX-WS Provider
=======================================

Description
-----------

This project provides a client application for the previous jax-ws-demo-war 
example. It uses Apache CXF as the JAX-WS implementation. 

In addition Spring is used to initialize the application. It is possible to 
use Apache CXF directly without using Spring for the initialization.

The client will access the web service at the following location:

<http://localhost:8080/jax-ws-demo-war/ws/HelloService>

If necessary, you can change the URL inside
`src/main/resources/fi/codecenter/examples/client/applicationContext.xml`.

Running the Sample
------------------

Run `fi.codecenter.examples.client.HelloServiceClient` inside Eclipse.