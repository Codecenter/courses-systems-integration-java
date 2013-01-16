Using Spring Web MVC to Publish a RESTful API
=============================================

Description
-----------

This sample demonstrate how Spring Web MVC can be used to publish a RESTful
API for a web application. This might be a reasonable alternative if the 
application is already using Spring Web MVC and the interface is simple.

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
