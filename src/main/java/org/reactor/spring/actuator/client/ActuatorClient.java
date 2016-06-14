package org.reactor.spring.actuator.client;

import org.reactor.spring.actuator.client.service.MetricsService;
import org.reactor.spring.actuator.client.service.HealthService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author grabslu
 */
public class ActuatorClient {

  private final String actuatorServiceUrl;
  private Retrofit retrofit;

  public ActuatorClient(String actuatorServiceUrl) {
    this.actuatorServiceUrl = actuatorServiceUrl;

    initializeRetrofit(actuatorServiceUrl);
  }

  private void initializeRetrofit(String actuatorServiceUrl) {
    retrofit = new Retrofit.Builder()
        .baseUrl(actuatorServiceUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
  }

  public String getActuatorServiceUrl() {
    return actuatorServiceUrl;
  }

  public HealthService getHealthService() {
    return retrofit.create(HealthService.class);
  }

  public MetricsService getMetricsService() {
    return retrofit.create(MetricsService.class);
  }
}
