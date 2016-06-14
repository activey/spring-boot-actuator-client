package org.reactor.spring.actuator.client.service;

import org.reactor.spring.actuator.client.model.HealthInformation;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author grabslu
 */
public interface HealthService {

  @GET("health")
  Call<HealthInformation> getHealthInformation();
}
