## ETL Pipeline Demo

This a ETL (Export Tranform and Load) pipeline demo written in Java.

## Details

The goal was to mimic an integration programme typical within enterprise environments concerned with messaging between various systems. Usually these applications would run on a physical or virtual infratructure leveraging a middleware application (eg. IBM MQ, Azure Service Bus, Apache Kafka), but here we are using input and output folders for simplicity.

The input file is a CSV, mirroring a legacy-type system, and the output is an expected XML defined by a DTD located in src\com\cogniwire\etlPipeline\voucherPatterns.xsd. The XSD was converted into Java classes using the schema binding tool XJC as a one-off activity, and these elements were marshalled into an XML object model, before being finally exported into an XML file in the output folder. 

For database instead of file system exchanges, SQL could have been used with the approproprite JDBC driver. For simplicity sake, and avoiding the prequisite for database platforms in a demo, file systems were chosen.

## Dependency Management

The tool was built in Java 21 and leveraged libraries from Jakarta, included in the .\lib folder. 

XJC was used from the Java 8 implementation.
