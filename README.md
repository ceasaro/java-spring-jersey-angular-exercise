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
4. Open de file `src/angularJS/main/index.html` in the browser.

##Stucture
The src directory contains four directories:

  1. angularJS      - contains the front end build in AngularJS (html pages) 
  2. main           - contains the REST-API build in java Spring en Jersey
  3. test           - test for the main java application (REST-API)
  4. jersey_patch   - A copy of the jersey-spring3 module to make the spring context available to jersey.
  
##Issues
Jersey can't get access to the spring context, their is a library 'org.glassfish.jersey.ext' which provide support for
 Spring3 integration, but when bundled with the application is tries to load a spring context itself resulting in an 
 error noting that their is already a context present and it's not able to initialize a second.
 
 I'm using java based configuration for spring as well as for the java servlets. Their is an example 
 [here](http://stackoverflow.com/questions/25701658/integrating-jersey-2-and-spring-with-java-based-configuration)
 using a web.xml configuration for the servlets.
  

  