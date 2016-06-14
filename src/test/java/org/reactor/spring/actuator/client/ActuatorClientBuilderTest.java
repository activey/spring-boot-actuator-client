package org.reactor.spring.actuator.client;

import org.fest.assertions.Assertions;
import org.junit.Test;

import static org.reactor.spring.actuator.client.ActuatorClientBuilder.clientBuilder;

/**
 * @author grabslu
 */
public class ActuatorClientBuilderTest {

  public static final String ACTUATOR_SERVICE_URL = "http://some.service";

  @Test
  public void shouldCreateNewActuatorClient() {
    // given
    ActuatorClient actuatorClient = clientBuilder()
        .forServiceUrl(ACTUATOR_SERVICE_URL)
        .build();

    // then
    Assertions.assertThat(actuatorClient.getActuatorServiceUrl()).isEqualTo(ACTUATOR_SERVICE_URL);
  }

}