package org.reactor.spring.actuator.client;

import org.junit.Test;
import org.reactor.spring.actuator.client.model.MetricsInformation;
import org.reactor.spring.actuator.client.model.HealthInformation;
import org.reactor.spring.actuator.client.service.HealthService;
import org.reactor.spring.actuator.client.service.MetricsService;
import retrofit2.Call;

import java.io.IOException;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author grabslu
 */
public class ActuatorClientIntegrationTest {

  @Test
  public void shouldReturnHealthInformation() throws IOException {
    // given
    ActuatorClient actuatorClient = ActuatorClientBuilder.clientBuilder().build();
    HealthService healthService = actuatorClient.getHealthService();

    // when
    Call<HealthInformation> healthInformationCall = healthService.getHealthInformation();
    HealthInformation healthInformation = healthInformationCall.execute().body();

    // then
    assertThat(healthInformation.getStatus()).isNotEmpty();
  }

  @Test
  public void shouldReturnMetricsInformation() throws IOException {
    // given
    ActuatorClient actuatorClient = ActuatorClientBuilder.clientBuilder().build();
    MetricsService metricsService = actuatorClient.getMetricsService();

    // when
    Call<MetricsInformation> metricsInformationCall = metricsService.getMetricsInformation();
    MetricsInformation metricsInformation = metricsInformationCall.execute().body();

    // then
    assertThat(metricsInformation.getMemoryFree()).isGreaterThan(0);
  }

}