package org.reactor.spring.actuator.client.service;

import org.reactor.spring.actuator.client.model.MetricsInformation;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author grabslu
 */
public interface MetricsService {

  @GET("metrics")
  Call<MetricsInformation> getMetricsInformation();
}
