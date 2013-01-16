Using Apache CXF as the JAX-WS Provider
=======================================

Description
-----------

This project extends the previous jax-ws-demo-war example by using
Apache CXF as the JAX-WS implementation. In addition Spring is used
to initialize the application.

Running the Sample
------------------

The project is packaged as a WAR. You can start the web application directly
using Maven with the command `mvn tomcat:run`. It will launch Tomcat directly
on the project.

After Tomcat has started you can access the web service at:

<http://localhost:8080/jax-ws-demo-war-cxf/ws/HelloService>

This project does not include a client. Instead you can use the client in
projects jax-ws-demo-client-cxf and jax-ws-demo-client-spring. Make sure the
web service URL in the client's configuration file 
`src/main/resources/fi/codecenter/examples/client/applicationContext.xml`
matches the one above.