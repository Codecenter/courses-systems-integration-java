Sample Usage of JAX-RS Inside a Web Application
===============================================

Description
-----------

Simple web application where a class is published as a RESTful web service 
using JAX-RS. The web application uses Servlet 3.0 so it's not necessary to
configure anything inside the `web.xml`.

The JAX-RS application is configured using class 
`fi.codecenter.examples.HelloApplication`.

The JAX-RS implementation used in this example is Jersey. 

Running the Sample
------------------

Use Maven to launch Tomcat directly from the project:

<pre>
mvn tomcat:run
</pre>

The `HelloService` can be found at:

<http://localhost:8080/jax-rs-demo-war/rest/hello>

You can use `fi.codecenter.examples.client.HelloServiceClient` to test the 
service. Run the application inside Eclipse.
