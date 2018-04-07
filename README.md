# Maven profiles per environment with Spring Boot 2.x

This is a spring boot rest project that handle the application properties per environment using Maven profiles.

## Which Profile?

There are two kind of profiles:

1. [Maven Profiles](http://maven.apache.org/guides/introduction/introduction-to-profiles.html): A build-time approach.
```
clean install -Pdev
```

2. [Spring Profiles](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html): A runtime approach.
```
java -jar -Dspring.profiles.active=dev xxx.jar
```

The answer depends on your requirements. A good rule of thumb:

_**If you need different artifacts then go with Maven profiles. If it is just a real configuration that can be set AFTER the artifact is built then go with Spring profiles.**_

Basically, Maven profiles would provide a build-time solution, while Spring profiles would provide a runtime alternative.

## Technologies

1. Spring Boot 2.x (spring-boot-starter-web, spring-boot-starter-tomcat)
2. Java 8
3. Tomcat 8.5
4. Maven

## Exposed methods to test that it works

**1. HTTP Method: GET**
```
http://localhost:8080/mvnspringboot/params/all
```

## Other Alternatives (Examples)

* [Activate Spring property files with Maven profiles](http://dolszewski.com/spring/spring-boot-properties-per-maven-profile/): It replaces the placeholder for the _spring.profiles.active_ variable with the active Maven profile at build time so the Spring framework, after starting your app, can load the appropriate configuration file based on the name of the active Spring profile.
* [Maven copy-rename-maven-plugin plugin](https://coderplus.github.io/copy-rename-maven-plugin/usage.html): The idea is to copy the complete specific profile file (dev.properties) to create the application properties inside the project output directory (application.properties). For this you need the help of Maven resources and Maven filtering. The best usage of this rename plugin is when you need a .json file or .txt file per environment.

## Useful Documentation

* [Automatic Property Expansion using Maven](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-properties-and-configuration.html)
* [Spring Boot Relaxed Binding](https://github.com/spring-projects/spring-boot/wiki/Relaxed-Binding-2.0)
* [Spring Boot Externalized Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)
* [Spring Boot traditional deployment](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-traditional-deployment.html)
* [Spring Boot 2 - Release Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes)

## Additional Useful Links

* [How to install Tomcat 8.x in AWS](https://github.com/carlosCharz/installtomcataws)
* [How to install Jenkins 2.x in AWS](https://github.com/carlosCharz/installjenkinsaws)
* [Configure Jenkins 2.x with Tomcat 8.x in AWS](https://github.com/carlosCharz/configurejenkinstomcat)

## Troubleshooting

* All the build phase is done correctly from Eclipse or CLI (Command Line Interface) for the 'dev' profile with the command 'clean install -Pdev'. The war file is created with the variables from the desired profile. If you deploy the war in a Tomcat container manually or using Jenkins it is going to work properly. _The problem might arise when you deploy using Eclipse. There are some issues with the m2e plugin where even when you build with the -Pdev it takes the activeByDefault profile. It seems that Eclipse is ignoring the profile provided. In that case, right click to the project -> Properties -> Maven and set the active Maven profile._

## About me
I am Carlos Becerra - MSc. Softwware & Systems.  But to tell you the truth, I'd prefer to be a passionate developer. You can contact me via:

* [Google+](https://plus.google.com/+CarlosBecerraRodr%C3%ADguez)
* [Twitter](https://twitter.com/CarlosBecerraRo)

_**Any improvement or comment about the project is always welcome! As well as others shared their code publicly I want to share mine! Thanks!**_

## License
```javas
Copyright 2018 Carlos Becerra

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
