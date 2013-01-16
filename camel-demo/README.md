Sample Camel OSGi Bundle
========================

Description
-----------


Running the Sample
------------------

Build the project using Maven:

<code>mvn install</code>

After a successful build the artifact target/camel-demo-*.jar can be copied to 
the deploy directory in ServiceMix.

Before the deployment you may want to modify the default endpoints (using ftp 
and http). You can do that by adding a file fi.codecenter.examples.camel.cfg to 
the etc directory in ServiceMix with, for example, the following contents:

<pre>
InvoiceImport.from.uri=file:/tmp/camel-demo/in
InvoiceImport.to.uri=file:/tmp/camel-demo/out
</pre>
 
If you choose not to modify the endpoints, you must invoke the following 
commands in the ServiceMix console before the deployment:

<pre>
features:install camel-ftp
features:install camel-http
</pre>

Otherwise ServiceMix will complain about missing dependencies and the deployment
will fail. 