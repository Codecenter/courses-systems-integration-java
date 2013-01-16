Sample Usage of Apache Camel Test Kit
=====================================

Description
-----------

Camel has a route which fetches/accepts data from a configurable endpoint, 
filters it and sends it to another configurable endpoint. 

The route definition `camel-context.xml` and the configuration 
`route.properties` can be found under `src/main/resources`.

Filtering is tested using a JUnit test class `CamelTest` found under 
`src/test/java`.  

Running the Sample
------------------

You can run the JUnit test `CamelTest` inside your IDE, for example Eclipse.