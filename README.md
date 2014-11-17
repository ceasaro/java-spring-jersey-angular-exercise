#java-spring-jersey-angular-exercise

Exercise to get familiar with Spring Jersey and AngularJS

##Run application
Follow the steps below the run the application. We assume that JAVA7 and maven are already installed on your computer, 
if not check [www.java.com](https://www.java.com/en/download/help/index_installing.xml?j=7) how to install 
JAVA7 and [maven.apache.org](http://maven.apache.org/download.cgi') how to install maven.
 
1. Download the sources onto your machine by downloading the zip file
<a href='https://github.com/ceasaro/java-spring-jersey-angular-exercise/archive/master.zip'>Download ZIP</a>
 or by cloing the sources using git: `git clone git@github.com:ceasaro/java-spring-jersey-angular-exercise.git`
2. Change to the directory where you either unzipped the downloaded file or created the git clone.
3. In the root directory (the dir containing a *pom.xml* file), type the following command `mvn tomcat7:run`
4. 

##Stucture
The src directory contains four directories:

  1. angularJS      - contains the front end build in AngularJS (html pages) 
  2. main           - contains the REST-API build in java Spring en Jersey
  3. test           - test for the main java application (REST-API)
  4. jersey_patch   - A copy of the jersey-spring3 module to make the spring context available to jersey.
  

  