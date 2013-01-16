Sample Usage of JAX-WS
======================

Description
-----------

This project contains a web service developed using the contract-first model.

The WSDL document was written first and can be found in 
`src/main/webapp/WEB-INF/wsdl/HelloService.wsdl`. The WSDL specifies HTTP 
bindings for both SOAP 1.1 and 1.2.

During the build process the WSDL is processed by a Maven plug-in which 
generates a Java skeleton under `target/jaxws/wsimport/java`. You'll probably
want to add this directory to your Build Path in Eclipse.

The generated skeleton includes a Java interface describing the web service 
`fi.codecenter.examples.HelloService`. It is implemented by the web service 
implementation `fi.codecenter.examples.HelloServiceImpl`. 

Running the Sample
------------------

The project is packaged as a WAR. You can start the web application directly
using Maven with the command `mvn tomcat7:run`. It will launch Tomcat directly
on the project.

After Tomcat has started you can access the web service at:

http://localhost:8080/jax-ws-demo-war/HelloService

You can use the class `fi.codecenter.examples.client.HelloServiceClient`
with a `main` method to access the service.

The JAX-WS implementation used in this project is Metro.