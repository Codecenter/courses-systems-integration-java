Sample Usage of JAX-RS Inside a Web Application
===============================================
Copyright @ Codecenter Oy. All rights reserved.

Description
-----------

Simple web application where a class is published as a RESTful web service 
using JAX-RS. The web application uses Apache CXF so it's necessary to
configure the CXFServlet inside the `web.xml`.

Running the Sample
------------------

Use Maven to launch Tomcat directly from the project:

<pre>
mvn tomcat:run
</pre>

The `HelloService` can be found at:

<http://localhost:8080/jax-rs-demo-war-cxf/rest/helloApp/hello>

You can use `fi.codecenter.examples.client.HelloServiceClient` to test the 
service. Run the application inside Eclipse.
