Build the project using Maven:

mvn install

After a successful build the artifact target/camel-demo-1.0.0-SNAPSHOT.jar can 
be copied to ServiceMix's deploy directory.

Before deployment you may want to modify the default endpoints. You can do that
by adding a file etc/fi.codecenter.examples.camel.cfg to the ServiceMix installation 
directory with the following contents:

InvoiceImport.from.uri=file:/tmp/camel-demo/in
InvoiceImport.to.uri=file:/tmp/camel-demo/out
 
If you choose not to modify the endpoints, you must invoke the following 
commands in the ServiceMix console before the deployment:

features:install camel-ftp
features:install camel-http
