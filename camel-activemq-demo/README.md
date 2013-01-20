Using Apache Camel with ActiveMQ
================================
Copyright @ Codecenter Oy. All rights reserved.

Description
-----------

In this sample files are transferred using Apache Camel and ActiveMQ. The 
result is an OSGi bundle which can be added to an OSGi container, for example 
Apache ServiceMix. 

The first route reads files from `camel/activemq/in` and sends them to JMS 
queue `camel-activemq-demo`. The second route accepts messages from the same
JMS queue and stores them as files in `camel/smooks/out`. As all the headers
pass with the messages the file name remains the same.

Running the Sample
------------------

Build the project using Maven:

<pre>
mvn install
</pre>

After a successful build the artifact `target/camel-activemq-demo-*.jar` can be 
copied to the `deploy` directory in ServiceMix.

Before the sample starts working you must start Apache ActiveMQ and make sure it 
listens in port 61610 (the default port is 61616). Download ActiveMQ from 
<http://activemq.apache.org/download.html>, unpack the archive and modify 
`conf/activemq.xml`. Locate the element <transportConnector /> and change the
port number in the URI.
