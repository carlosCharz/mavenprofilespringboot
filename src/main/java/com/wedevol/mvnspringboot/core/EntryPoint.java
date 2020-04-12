package com.wedevol.mvnspringboot.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Entry Point class
 *
 * https://docs.spring.io/spring-boot/docs/current/reference/html/howto-traditional-deployment.html
 *
 * @author Charz++
 */

@SpringBootApplication
public class EntryPoint extends SpringBootServletInitializer {

  protected static final Logger logger = LoggerFactory.getLogger(EntryPoint.class);

  private static final String catalinaHome = System.getProperty("catalina.home");

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    logger.info("Catalina home OS variable: {}", catalinaHome);
    return application.sources(EntryPoint.class);
  }

  public static void main(String[] args) {
    new SpringApplicationBuilder(EntryPoint.class).sources(EntryPoint.class).run(args);
  }

}
