Using Spring to Initialize the Web Service
==========================================

Description
-----------

This project extends the previous jax-ws-demo-war example by utilizing
Metro's Spring support for the web service initialization.

Running the Sample
------------------

After starting Tomcat using `mvn tomcat:run` you can access the web service at:

http://localhost:8080/jax-ws-demo-war-spring/ws/HelloService

This project does not include a client. Instead you can use the client in
projects jax-ws-demo-client-cxf and jax-ws-demo-client-spring. Make sure the
web service URL in the client's configuration file 
`src/main/resources/fi/codecenter/examples/client/applicationContext.xml`
matches the one above.