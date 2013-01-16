Using Apache CXF as the JAX-WS Provider
=======================================

Description
-----------

This project provides a client application for the previous jax-ws-demo-war 
example. It uses Apache CXF as the JAX-WS implementation. 

In addition Spring is used to initialize the application. It is possible to 
use Apache CXF directly without using Spring for the initialization.

If necessary, you can change the URL to which the client connects inside
`src/main/resources/fi/codecenter/examples/client/applicationContext.xml`.

Running the Sample
------------------

Run `fi.codecenter.examples.client.HelloServiceClient` inside Eclipse.