Sample Usage of JAX-WS
======================

Description
-----------
This project contains a web service developed using the contract-last model.
Java implementation is written first and then used to generate the WSDL at 
runtime.

Running the Sample
------------------
The project has two classes with the main method:

* `fi.codecenter.examples.server.HelloServiceServer` 
* `fi.codecenter.examples.client.HelloServiceClient`

The `HelloServiceServer` starts the web service at:

[http://localhost:9999/ws/hello]

The `HelloServiceClient` looks for the web service at the same address.

You can run both applications inside your IDE, for example Eclipse.

