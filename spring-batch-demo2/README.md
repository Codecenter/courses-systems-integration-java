Data Import Using Spring Batch
==============================
Copyright @ Codecenter Oy. All rights reserved.

Description
-----------

This project is a more complicated example where data is read from CSV file and 
imported to the database using JDBC.

The data is GeoLite data from MaxMind which contains net blocks and the country 
where the IP addresses are in use. This data is available from 
<http://www.maxmind.com>.

Running the Sample
------------------

You can try the demo with JUnit and HSQLDB with test class 
`jobs.geoip.GeoIPJobTest`.

You can also use the class 
`org.springframework.batch.core.launch.support.CommandLineJobRunner` to run the 
job from command-line. As the application requires many libraries, the easiest 
way to run the job is to run it inside Eclipse.

Use the following command-line parameters when running the job:

<pre>
&lt;springContextURL&gt; &lt;jobName&gt; geoIpFileSpec=&lt;fileSpecURL&gt;

classpath:commandLineJobContext.xml geoIPJob geoIpFileSpec=file:src/test/resources/jobs/geoip/*.csv
</pre>

Alternatively you can invoke the job using a special JAR that was generated in 
the project, `spring-batch-demo-executable.jar`. It has all the required 
libraries merged to a single JAR file.

<pre>
java -jar target/spring-batch-demo-executable.jar 
</pre>

Use the same parameters as you would when running inside Eclipse.

If you want to re-run the demo, you'll need to provide additional parameters
for the job, eg. `run.id=1` with the number incrementing on each run.

You'll need to have PostgreSQL properly set-up for both the demo and 
Spring before running the job. The SQL scripts for the demo can be found
under `src/main/resources`. The SQL for Spring Batch and PostgreSQL is 
found inside `spring-batch-core-<version>.jar`.
