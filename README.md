eShopie (for java 1.8 +)
-------------------

[![last_version](https://img.shields.io/badge/last_version-v1.0.1-blue.svg?style=flat)](https://github.com/mng335n/eShopie/tree/1.0.1)
[![Official site](https://img.shields.io/website-up-down-green-red/https/shields.io.svg?label=official%20site)](http://www.eShopie.com/)
[![Docker Pulls](https://img.shields.io/docker/pulls/eShopieecomm/eShopie.svg)](https://hub.docker.com/r/mng335n/eShopie)
[![stackoverflow](https://img.shields.io/badge/eShopie-stackoverflow-orange.svg?style=flat)](http://stackoverflow.com/questions/tagged/mng335n)
[![CircleCI](https://circleci.com/gh/eShopie-ecommerce/eShopie.svg?style=svg)](https://circleci.com/gh/mng335n/eShopie)


Java open source e-commerce software

- Headless commerce
- Shopping cart
- Catalogue
- Search
- Checkout
- Administration
- REST API

See the demo (jsp):
-------------------
http://aws-demo.eShopie.com:8080/

See the demo (React):
-------------------
Available soon


Get the code:
-------------------
Clone the repository:
     
	 $ git clone git://github.com/mng335n/eShopie.git

If this is your first time using Github, review http://help.github.com to learn the basics.

You can also download the zip file containing the code from https://github.com/mng335n/eShopie 

To build the application:
-------------------	
From the command line:

	$ cd eShopie
	$ mvnw clean install
	

Run the application from Tomcat 
-------------------
copy sm-shop/target/ROOT.war to tomcat or any other application server deployment dir

Increase heap space to 1024 m

### Heap space configuration in Tomcat:


If you are using Tomcat, edit catalina.bat for windows users or catalina.sh for linux / Mac users

	in Windows
	set JAVA_OPTS="-Xms1024m -Xmx1024m -XX:MaxPermSize=256m" 
	
	in Linux / Mac
	export JAVA_OPTS="-Xms1024m -Xmx1024m -XX:MaxPermSize=256m" 

Run the application from Spring boot 
-------------------

       $ cd sm-shop
       $ mvnw spring-boot:run

Run the application from Spring boot in eclipse
-------------------

Right click on com.salesmanager.shop.application.ShopApplication

run as Java Application

Run the application from Spring boot in IntelliJ
-------------------

In Run/Debug Configurations, set to the option Working directory the path of the sm-shop project

run ShopApplication

Run Docker image with working demo
-------------------

	docker run -p 80:8080 eShopieecomm/eShopie:latest


### Access the application:
-------------------

Access the deployed web application at: http://localhost:8080/

Access the admin section at: http://localhost:8080/admin

username : admin@eShopie.com

password : password

The instructions above will let you run the application with default settings and configurations.
Please read the instructions on how to connect to MySQL, configure an email server and configure other subsystems


