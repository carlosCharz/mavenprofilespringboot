package com.wedevol.mvnspringboot.core.configuration;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Custom settings loaded from a property file
 * 
 * @author Charz++
 */

@Component
@ConfigurationProperties(prefix = "custom")
public class CustomSetting {

  private static final Logger logger = LoggerFactory.getLogger(CustomSetting.class);

  private String serverUrl;

  private Long serverPort;

  private Boolean debuggable;

  private String imageQuality;

  public CustomSetting() {
    logger.info("Loading custom properties");
  }

  @PostConstruct
  public void postConstruct() {
    logger.info("Custom properties -> serverUrl: '{}', serverPort: '{}', debuggable: '{}', imageQuality: '{}'",
        serverUrl, serverPort, debuggable, imageQuality);
  }

  public String getServerUrl() {
    return serverUrl;
  }

  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }

  public Long getServerPort() {
    return serverPort;
  }

  public void setServerPort(Long serverPort) {
    this.serverPort = serverPort;
  }

  public Boolean getDebuggable() {
    return debuggable;
  }

  public void setDebuggable(Boolean debuggable) {
    this.debuggable = debuggable;
  }

  public String getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(String imageQuality) {
    this.imageQuality = imageQuality;
  }

  @Override
  public String toString() {
    return String.format("{ serverUrl: %s, serverPort: %d, debuggable: %s, imageQuality: %s }", serverUrl, serverPort,
        debuggable, imageQuality);
  }

}
