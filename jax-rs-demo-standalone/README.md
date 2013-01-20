Sample Usage of JAX-RS
======================
Copyright @ Codecenter Oy. All rights reserved.

Description
-----------

Simple project where a class is published as a RESTful web service using 
JAX-RS. 

The JAX-RS implementation used in this example is Jersey. 

Running the Sample
------------------
The project has two classes with the main method:

* `fi.codecenter.examples.server.HelloServiceServer` 
* `fi.codecenter.examples.client.HelloServiceClient`

The `HelloServiceServer` starts the web service at:

<http://localhost:9999/ws/hello>

The `HelloServiceClient` looks for the web service at the same address.

You can run both applications inside your IDE, for example Eclipse.
