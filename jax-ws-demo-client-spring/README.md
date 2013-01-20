Preparing the JAX-WS Client Using Spring
========================================
Copyright @ Codecenter Oy. All rights reserved.

Description
-----------

This project provides a client application for the previous jax-ws-demo-war 
example. It uses the default JAX-WS implemention included in the Oracle JDK.
The main point, however, is to initialize the client using Spring Framework.

The client will access the web service at the following location:

<http://localhost:8080/jax-ws-demo-war/ws/HelloService>

If necessary, you can change the URL inside
`src/main/resources/fi/codecenter/examples/client/applicationContext.xml`.

Running the Sample
------------------

Run `fi.codecenter.examples.client.HelloServiceClient` inside Eclipse.
