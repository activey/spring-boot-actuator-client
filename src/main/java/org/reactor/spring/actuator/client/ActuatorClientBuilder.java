package org.reactor.spring.actuator.client;

/**
 * @author grabslu
 */
public class ActuatorClientBuilder {

  private ActuatorClientProperties clientProperties = new ActuatorClientProperties();

  private ActuatorClientBuilder() {
    readClientProperties();
  }

  private void readClientProperties() {
    clientProperties = ActuatorClientPropertiesReader.read();
  }

  public static ActuatorClientBuilder clientBuilder() {
    return new ActuatorClientBuilder();
  }

  public ActuatorClient build() {
    return new ActuatorClient(clientProperties.getServiceUrl());
  }

  public ActuatorClientBuilder forServiceUrl(String serviceUrl) {
    clientProperties.setServiceUrl(serviceUrl);
    return this;
  }
}
