This project contains a web service developed using the contract-last model.
Java implementation is written first and then used to generate the WSDL at 
runtime.

The project has two classes with the main method:

fi.codecenter.examples.server.HelloServiceServer 
fi.codecenter.examples.client.HelloServiceClient

The HelloServiceServer starts the web service at:

http://localhost:9999/ws/hello

The HelloServiceClient looks for the web service at the same address.

The easiest way to run the applications is to use an IDE with Maven integration,
for example Eclipse and the m2e plugin.

