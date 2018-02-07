# Welcome to the Oracle Project Template Repository

## Purpose
This repository contains a basic project setup for any new Java project and assumes that there will be some kind of database migrations as well. 

##Rules of the Repository
* Master branch is production, period.
* Do not commit to master, please work off the development branch.
* When working locally, try to work in feature branches.
* Follow your git flow in `SourceTree`.

## Setup the Oracle JDBC Driver

* Download and install [Maven `3.5.0`](https://maven.apache.org/download.cgi). 
* You can download the [Oracle JDBC Driver](http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html) from this link.

We have to install the JDBC driver to our local maven repository because Oracle's licensing prohibits the driver from being available publicly. The follow command will install this in the local repo. 

`mvn install:install-file -Dfile="{path/to/ojdbc6.jar}" -DgroupId="com.oracle"  -DartifactId="ojdbc6" -Dversion="11.2.0.4" -Dpackaging="jar" -DgeneratePom="true"`

## Build Script
The following command will being a build and database migration for the local instance. To target another instance modify the `-Penv` flag. 

`build -Penv=local flywayMigrate -i --stacktrace`
