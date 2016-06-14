package org.reactor.spring.actuator.client;

import java.util.Properties;

/**
 * @author grabslu
 */
public class ActuatorClientProperties {

  private static final String PROPERTY_SERVICE_URL = "serviceUrl";

  private String serviceUrl;

  public ActuatorClientProperties() {}

  public ActuatorClientProperties(Properties properties) {
    readProperties(properties);
  }

  private void readProperties(Properties properties) {
    serviceUrl = properties.getProperty(PROPERTY_SERVICE_URL);
  }

  public String getServiceUrl() {
    return serviceUrl;
  }

  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }
}
