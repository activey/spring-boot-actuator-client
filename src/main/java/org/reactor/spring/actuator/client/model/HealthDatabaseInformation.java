package org.reactor.spring.actuator.client.model;

/**
 * @author grabslu
 */
public class HealthDatabaseInformation {

  private String status;
  private String database;
  private long hello;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public long getHello() {
    return hello;
  }

  public void setHello(long hello) {
    this.hello = hello;
  }
}
