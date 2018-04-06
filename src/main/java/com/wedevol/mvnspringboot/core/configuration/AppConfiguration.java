package com.wedevol.mvnspringboot.core.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Application configuration class
 *
 * @author Charz++
 */

@EnableConfigurationProperties({CustomSetting.class})
public class AppConfiguration {

}

