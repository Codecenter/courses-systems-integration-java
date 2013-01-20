Using Smooks with Apache Camel
==============================
Copyright @ Codecenter Oy. All rights reserved.

Description
-----------

In this sample Smooks is used to transform CSV to XML inside an Apache Camel route. 
The result is an OSGi bundle which can be added to an OSGi container, for example Apache ServiceMix. 

The bundle reads CSV files from `camel/smooks/in` and converts them to XML in `camel/smooks/out`.

Running the Sample
------------------

Build the project using Maven:

<pre>
mvn install
</pre>

After a successful build the artifact `target/camel-smooks-demo-*.jar` can be copied to 
the `deploy` directory in ServiceMix.

Before the deployment you must run the following commands in the ServiceMix console:

<pre>
features:addUrl mvn:org.milyn/milyn-smooks-all/1.5.1/xml/features
features:install smooks
</pre>

Otherwise ServiceMix will complain about missing dependencies and the deployment
will fail. 
