Simple Spring Integration Demo
==============================
Copyright @ Codecenter Oy. All rights reserved.

Description
-----------

Simple example where Spring Integration is used to poll XML files from one 
directory, apply XSLT and store the results in another directory. The XSLT
basically generates invoice XML from product order XML.

Running the Sample
------------------

The application can be started using the class 
`fi.codecenter.examples.InvoiceImportApp`. No command-line parameters are 
required to start the application.

By default, the application looks for `Order*.xm` inside `target/in`.
The resulting files are written to `target/out`.
